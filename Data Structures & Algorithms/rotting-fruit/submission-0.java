class Solution {
    public int orangesRotting(int[][] grid) {
        
        int n =grid.length;
        int m = grid[0].length;
        int count=0;
        Queue<int[]> q = new LinkedList<>();
        int[][] vs=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    vs[i][j]=2;
                    q.add(new int[]{i,j,0});
                }else{
                    vs[i][j]=0;
                }

                if(grid[i][j]==1){
                    count++;
                }
            }
        }

        int tm=0;
        int [][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
        int co=0;
        while(!q.isEmpty()){
            int[] x = q.poll();
            int r =x[0];
            int c=x[1];
            int t=x[2];
            tm=Math.max(tm , t);

            for(int[] d : dir){
                int nr= r+d[0];
                int nc=c+d[1];
                if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1 && vs[nr][nc]==0){
                    q.add(new int[]{nr , nc , t+1});
                    vs[nr][nc]=2;
                    co++;

                }
            }

        }
        return count==co ? tm : -1;
        


    }
}
