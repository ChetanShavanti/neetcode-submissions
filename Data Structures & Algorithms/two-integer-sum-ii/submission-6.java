class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n= numbers.length;
        int[] ans = new int[2];

        for(int i=0;i<n; i++){
            for(int j=i+1; j<n; j++){
               int s = sum(numbers[i], numbers[j]);
                if(s == target){
                    ans[0] = i+1;
                    ans[1] = j+1;
                }
            }
        }
        return ans;
    }

    public int sum(int a , int b){
        return  a+b;
    }
}
