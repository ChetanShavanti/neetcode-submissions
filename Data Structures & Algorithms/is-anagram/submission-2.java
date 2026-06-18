class Solution {
    public boolean isAnagram(String s, String t) {
      if (s.length() != t.length()){
        return false;
      }
    
    char[] sA = s.toCharArray();
    char[] tA = t.toCharArray();

    Arrays.sort(sA);
    Arrays.sort(tA);
    int count =0;
    for(int i=0; i<sA.length; i++){
        if(sA[i] != tA[i]){
           return false;
        }
    }
return true;

    }
}
