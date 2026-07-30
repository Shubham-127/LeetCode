class Solution {
    public int maxDepth(String s) {
        int count =0;
        int maxdept =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
               
            }
            else if (s.charAt(i)==')'){
                
                maxdept = Math.max(count, maxdept);
                count--;
            }

        }
        return maxdept;
       
        
    }
}