class Solution {
    public String reverseStr(String str, int k) {
        
        char[] arr = str.toCharArray();
        int i = 0;
        int j = k-1;
        if(j > arr.length-1){
            int s = i;
            int e = j;
            s = i;
            e = arr.length-1;
            while(s < e){
                char temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
            i += 2*k;
            j = i+k-1;
        }
        while(i < arr.length && j < arr.length){
            int s = i;
            int e = j;
            while(s < e){
                char temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
            i += 2*k;
            j = i+k-1;

            if(j > arr.length-1){
                s = i;
                e = arr.length-1;
                while(s < e){
                    char temp = arr[s];
                    arr[s] = arr[e];
                    arr[e] = temp;
                    s++;
                    e--;
                }
                i += 2*k;
                j = i+k-1;
            }
        }
        return String.valueOf(arr);
    }

}