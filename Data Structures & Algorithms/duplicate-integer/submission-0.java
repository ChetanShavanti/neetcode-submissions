class Solution {
    public boolean hasDuplicate(int[] nums) {
        int a = nums.length;
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0; i<a; i++){
            hs.add(nums[i]);
        }
        if(a==hs.size()){
            return false;
        }else{
            return true;
        }
        
    }
}