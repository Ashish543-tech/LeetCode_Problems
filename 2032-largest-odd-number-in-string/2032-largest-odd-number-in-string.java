class Solution {
    public String largestOddNumber(String num) {
      StringBuilder ans = new StringBuilder();
      int flag = 0;
      int index = 0;
      for(int i=num.length()-1; i>=0; i--){
        char ch = num.charAt(i);  
        if(Character.getNumericValue(ch) % 2 == 0){
            flag = 0;
        }
        else{
            flag = 1;
            index = i;
            break;
        }
      }
      if(flag == 0){
          return "";
      }
      for(int j=0; j<=index; j++){
          ans.append(num.charAt(j));
      }
      return ans.toString(); 
    }
}