class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] res=new int[nums1.length+nums2.length];
        
        for(int i=0;i<nums1.length;i++){
            res[i]=nums1[i];
        }
        int index=0;
        for(int i=nums1.length;i<res.length;i++){
            res[i]=nums2[index];
            index++;
        }
        Arrays.sort(res);
        if(res.length %2!=0){
            return (double) res[res.length/2];
        }
        else{
            return (double) (res[(res.length/2)-1]+res[res.length/2])/2;
        }
    }
}