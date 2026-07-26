class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> Words = new ArrayList<>();
        Integer L = s.length();

        for(int i=0;i<L; i++){
          char ch = s.charAt(i);
           if(ch==' '){
            if(sb.length()>0){
            Words.add(sb.toString());
            sb.setLength(0);
            }
           }
           else if(i==L-1){
            sb.append(ch);
            Words.add(sb.toString());
           }
           
           else{
           sb.append(ch);
           }
        }
        // return L.toString();
        // return Words.toString();
        int left =0;
        int right = Words.size()-1;
        while(left<right&&left!=right){
            String temp = Words.get(left);
            Words.set(left, Words.get(right));
            Words.set(right,temp);

            left++;
            right--;

        }

        String result = String.join(" ", Words);
        return result;
        
    }
}