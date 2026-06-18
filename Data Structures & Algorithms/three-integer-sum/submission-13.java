class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        
        Set<List<Integer>> finalans = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if( (nums[i] + nums[j] + nums[k] ) == 0){
                        List<Integer> triplets = new ArrayList<>();
                        triplets.add(nums[i] );
                        triplets.add(nums[j] );
                        triplets.add(nums[k] );
                        Collections.sort(triplets);
                        finalans.add(triplets);
                    }
                }
            }
        }
        return new ArrayList<>(finalans);
    }
}
