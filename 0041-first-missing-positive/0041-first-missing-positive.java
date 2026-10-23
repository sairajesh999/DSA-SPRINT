class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int n=1;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<n;i++){
        if(!set.contains(n)){
            return n;
            
        }
        else{
            n++;
        }
        }
        
return n;

    }
}