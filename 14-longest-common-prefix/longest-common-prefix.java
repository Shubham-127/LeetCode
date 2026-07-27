class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String a = strs[0];
        String b = strs[strs.length-1];
        StringBuilder result = new StringBuilder();
        int l = Math.min(a.length(), b.length());
       
        for(int i=0; i<l;i++){
            if(a.charAt(i)==b.charAt(i)&&a.charAt(0)==b.charAt(0)){
                result.append(a.charAt(i));
            }
            else{
                break;
            }
        }

return result.toString();
    }
}

































        // if(strs == null || strs.length == 0)
        //     return "";

        // String prefix = strs[0];

        // for(int i = 1; i < strs.length; i++) {

        //     while(strs[i].indexOf(prefix) != 0) {

        //         prefix = prefix.substring(0, prefix.length() - 1);

        //         if(prefix.isEmpty())
        //             return "";
        //     }
        // }

        // return prefix;
    
