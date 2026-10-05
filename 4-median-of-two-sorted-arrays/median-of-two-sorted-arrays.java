class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] merge=new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,merge,0,nums1.length);
        System.arraycopy(nums2,0,merge,nums1.length,nums2.length);
        Arrays.sort(merge);
        double median;
        if(merge.length%2==0)
        {
            int m=merge.length/2;
            median=(merge[m]+merge[m-1]);
            median=median/2;
            System.out.println(median);
        }
        else
        {
           int n=merge.length/2;
           median=merge[n];
           System.out.println(median);
        }
        return median;


    }
}