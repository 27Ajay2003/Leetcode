class Solution {
    public int search(int[] nums, int target) {
        int i;
        int flag=0;
        if(nums[0]<=nums[nums.length-1]){
        int begin=0;
        int end=nums.length-1;
        while(begin<=end){
            int mid=(begin+end)/2;
            if(nums[mid]==target){
                flag=1;
                return mid;
            }
            else if(nums[mid]<target){
                begin=mid+1;
            }
            else{
               end=mid-1 ;
            }

        }
        if(flag==0){
            return -1;
        }
    }
    else if(nums[0]>nums[nums.length-1]){
        if(target>=nums[0]){
            for(i=0;i<nums.length-1;i++){
                if(nums[i]==target){
                    return i;
                }
                if(nums[i]>nums[i+1]){
                    return -1;
                }
        }}
        else{
            for(i=nums.length-1;i>0;i--){
                if(nums[i]==target){
                    return i;
                }
                if(nums[i]<nums[i-1]){
                    return -1;
                }
            }
        }}
        return -1;}
    

    
}
