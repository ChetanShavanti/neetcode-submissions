class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // List<List<Integer>> finalans = new ArrayList<>();
        Set<List<Integer>> finalans = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if( (nums[i] + nums[j] + nums[k] ) == 0){
                        List<Integer> triplets = new ArrayList<>();
                        triplets.add(nums[i] );
                        triplets.add(nums[j] );
                        triplets.add(nums[k] );
                        //Sorting to avoid duplication (commented Arraylist to avoid duplicate triplates)
                        Collections.sort(triplets);
                        finalans.add(triplets);
                    }
                }
            }
        }
        return new ArrayList<>(finalans);
    }
}
