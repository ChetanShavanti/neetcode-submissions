class Solution {
    public boolean isPalindrome(String s) {
        List<Character> ls = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            char tempCh = Character.toLowerCase(s.charAt(i));
            if (Character.isLetterOrDigit(tempCh)) {
                ls.add(tempCh);
            }
        }
        int j=ls.size()-1;
        for(int i=0 ; i<j; i++,j--){
            if(ls.get(i) != ls.get(j)){
                return false;
            }
        }
        return true;
    }
}
