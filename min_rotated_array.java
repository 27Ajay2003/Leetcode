class Solution {
    public int findMin(int[] nums) {
        if(nums[0]<nums[nums.length-1]){
            return nums[0];
        }
        else{
            for(int i=nums.length-1;i>0;i--){
                if(nums[i]<nums[i-1]){
                    return nums[i];
                }
            }
        } return nums[0];
    }
}
