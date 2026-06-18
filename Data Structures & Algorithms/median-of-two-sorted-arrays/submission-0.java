class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            merged[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            merged[nums1.length + i] = nums2[i];
        }

        Arrays.sort(merged);
        double ans = 0.0;
        int total = merged.length;
        int mid = (int)total/2;
        if(total % 2 != 0){
        ans = merged[mid];
        }else{
            int l = merged[mid];
            int r = merged[mid-1];
            ans = (double) ((l+r)/2.0);
        }

        return ans;
    }
}
