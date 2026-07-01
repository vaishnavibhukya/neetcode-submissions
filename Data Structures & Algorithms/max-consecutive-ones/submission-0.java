class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0;

        int n = nums.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(nums[j]==0) break;
                count++; 
            }
            res =Math.max(res , count);
        }
        return res;
        
        
    }
}