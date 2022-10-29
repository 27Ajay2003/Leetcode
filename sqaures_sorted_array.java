class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int A[]=new int[nums.length];
        int count=nums.length-1;
        while(i<=j){ 
            if (Math.abs(nums[j]) >= Math.abs(nums[i])){
                A[count]=nums[j]*nums[j];
                j--;
                count--;
            }
            else{
                A[count]=nums[i]*nums[i];
                i++;
                count--;
            }
        }
        return A;
    }
}
