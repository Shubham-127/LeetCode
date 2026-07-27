class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for(int i =0;i<s.length();i++){
            if(sb.toString().equals(goal)){
                return true;
            }
            else{
                sb.setLength(0);
                sb.append(s.substring(i+1) + s.substring(0,i+1));
            }
        }
        return false;
    }
}