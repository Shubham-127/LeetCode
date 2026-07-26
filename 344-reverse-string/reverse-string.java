class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;

        while(left<right){
            char sb = s[left];
            s[left] = s[right];
            s[right]= sb;
            left++;
            right--;

        }
      System.out.println(Arrays.toString(s));

        
    }
}