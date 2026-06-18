class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int ref = nums[i];
            int count =1;
            for(int j=0; j<nums.length; j++){
                if(ref == nums[j]){
                    count++;
                }
            }
            hs.put(nums[i],count);
        }
// Convert map to list for sorting
        List<Map.Entry<Integer,Integer>> list =
                new ArrayList<>(hs.entrySet());
        
        // Sort based on frequency (descending)
        Collections.sort(list, (a,b) -> b.getValue() - a.getValue());
        
        // Take top k keys
        for(int i=0; i<k; i++){
            ans[i] = list.get(i).getKey();
        }
        
        return ans;
    }
}