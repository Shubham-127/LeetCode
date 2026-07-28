class Solution {
    public String smallestPalindrome(String s) {
        int l = s.length()/2;
        char[] c1 = new char[l];
        char[] c2 = new char[l];
        int count =0;
        char middle = '\0';
        StringBuilder str = new StringBuilder();
        if(s.length()==1){
            return s;
        }
        
        if(s.length()%2 !=0){
            middle = s.charAt(l);
            }
        

        for(int i=0;i<l;i++){
            c1[i] = s.charAt(i); 

        }
        Arrays.sort(c1);
        for(int i = c1.length-1;i>=0; i--){
            
            c2[count] = c1[i];
            count++;

        }

        str.append(c1);
        if(middle != '\0'){
        str.append(middle);
        }
        str.append(c2);
        return str.toString();
        
    }
}