class Solution {
    public int search(int[] nums, int target) {
        int mid = nums.length/2;
        int ans = -1;
        if(nums[mid] == target){
            ans = mid;
        }else {
            if(nums[mid] > target){
                for(int i=mid; i>=0; i--){
                    if(nums[i] == target){
                        ans = i;
                    }
                }
            }else{
                for(int i=mid; i<nums.length; i++){
                   if(nums[i] == target){
                        ans = i;
                    }
                }
            }
        }
        return ans;
    }   
}