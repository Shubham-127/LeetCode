class Solution {
    public String largestOddNumber(String num) {
   int left = 0;
   int right = num.length()-1;
   StringBuilder sb = new StringBuilder();
   while(left<=right){
    if(num.charAt(left)!=0){
   char ch = num.charAt(right);
   if((ch -'0')%2!=0) {
     String b =  num.substring(left,right+1);
     sb.append(b);
     break;
   } 
   else{
    right--;
   }
    }
    else{
        left++;
    }
   }
   return sb.toString();
    }
}