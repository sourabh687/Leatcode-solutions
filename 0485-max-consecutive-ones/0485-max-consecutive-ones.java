class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int count =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 1){
                ans = Math.max(ans,count);
                count = 0;
            }else{
                count++;
            }
        }
        
        return Math.max(ans, count);
    }
}