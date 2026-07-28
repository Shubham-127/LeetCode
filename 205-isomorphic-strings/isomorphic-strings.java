class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character, Character> m1 = new HashMap<>();
        HashMap<Character, Character> m2 = new HashMap<>();

        for(int i =0; i<s.length(); i++){

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(m1.containsKey(c1)){
                if(m1.get(c1)!=c2){
                    return false;
                }
                
            }
            else{
                m1.put(c1,c2);
            }
            
            if(m2.containsKey(c2)){
                if(m2.get(c2)!=c1){
                   return false;
                }

            }
            else{
                m2.put(c2,c1);
            }
        }

        // for(int i=0;i<s.length();i++){
        //     char a = s.charAt(i);
        //     char b = t.charAt(i);

        //     for(int j = 0;j<s.length(); j++){
        //         if(s.charAt(j)==a){
        //             if(t.charAt(j)!=b){
        //                 return false;
        //             }
        //         }
        //     }
        //     for(int j=0;j<t.length();j++){
        //         if(t.charAt(j)==b){
        //             if(s.charAt(j)!=a){
        //                 return false;
        //             }
        //         }
        //     }
        // }

        return true;
        
    }
}