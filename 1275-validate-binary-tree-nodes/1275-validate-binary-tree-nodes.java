class Solution {
    private boolean isBinaryTreeValid(int current, int[] leftChild, int[] rightChild, boolean[] visited) {
        
        if (leftChild[current] != -1) {
            if (visited[leftChild[current]]) 
                return false;

            visited[leftChild[current]] = true;
            if (!isBinaryTreeValid(leftChild[current], leftChild, rightChild, visited))
                return false;
        }

       
        if (rightChild[current] != -1) {
            if (visited[rightChild[current]]) 
                return false;

            visited[rightChild[current]] = true; 
            if (!isBinaryTreeValid(rightChild[current], leftChild, rightChild, visited))
                return false;
        }
        return true;
    }

    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        boolean[] childCount = new boolean[n]; 

        
        for (int child : leftChild) {
            
            if (child != -1)
                childCount[child] = true; 
        }

        
        for (int child : rightChild) {
            
            if (child != -1) {
                if (childCount[child]) 
                    return false;

                childCount[child] = true; 
            }
        }

        int root = -1; 
        for (int i = 0; i < n; ++i) {
            if (!childCount[i]) {
                if (root == -1)
                    root = i;
                else
                    return false; 
            }
        }

        if (root == -1)
            return false; 

        boolean[] visited = new boolean[n]; 
        visited[root] = true;
        if (!isBinaryTreeValid(root, leftChild, rightChild, visited)) 
            return false;

        
        for (boolean visit : visited)
            if (!visit)
                return false;

        return true; 
    }
}