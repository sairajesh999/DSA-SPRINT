class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int [] rotated=new int[nums.length];
        int index=0;
        for(int i=nums.length-k;i<nums.length;i++){
            rotated[index]=nums[i];
            index++;
        }
        for(int i=0;i<nums.length-k;i++){
            rotated[index]=nums[i];
            index++;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=rotated[i];
        }

    }
}