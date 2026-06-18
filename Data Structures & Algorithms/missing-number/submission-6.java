class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums[nums.length-1];
        int finaltotal = (n*(n+1))/2;
        int current = 0;
        for(int i=0; i<nums.length; i++){
            current  = current + nums[i];
        }
        if( nums[0] == 0 && (finaltotal - current == 0)){
            return nums[nums.length-1] +1;
        }
        return finaltotal - current;
    }
}
