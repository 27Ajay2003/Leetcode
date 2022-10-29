class Solution {
    public boolean isPerfectSquare(int num) {
        long begin=1,end=num;
        while(begin<=end){
            long mid=(begin+end)/2;
            if(mid*mid==num){
                return true;
            }
            if(mid*mid<num){
                begin=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}
