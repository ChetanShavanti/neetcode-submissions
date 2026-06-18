class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums){
            hs.add(i);
        }
        // System.out.println("hs "+hs.size());
        // System.out.println("hs "+nums.length);
        if(hs.size() == nums.length){
            return false;
        }
        return true;
    }
}