class Solution {
    public int trap(int[] height) {
        if(height==null ||height.length==0){
            return 0;
        }

        int n =height.length;
        int res=0;
        for(int i=0;i<n;i++){
            int left=height[i];
            int right=height[i];

            for(int j=0;j<i;j++){

                left=Math.max(left , height[j]);
            
            }
            for(int j=i+1;j<n;j++){
                right=Math.max(right , height[j]);
            }
            res += Math.min(left , right)-height[i];
            
        }
        return res;
    }
}

       