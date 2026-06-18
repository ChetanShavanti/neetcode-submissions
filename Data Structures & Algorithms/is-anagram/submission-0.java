class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() == t.length()){ 
            char [] Sa = s.toCharArray();
            char [] Ta = t.toCharArray();
 
            Arrays.sort(Sa);
            Arrays.sort(Ta);
            int c = 0;
            for(int i=0; i<s.length(); i++){
                if(Sa[i] ==  Ta[i]){
                    c++;
                }
            }
            if(c==s.length()){
                return true;
            }
        }
    return false;      
    }
}

