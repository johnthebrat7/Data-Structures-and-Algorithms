class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int [][] dpa=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            Arrays.fill(dpa[i],-1);
        }
        return dp(arr,0,0,dpa);
    }
    public int dp(int [][] arr,int r,int c,int [][] dpa){
        if(r==arr.length || c==arr[0].length) return 0;
        if(arr[r][c]==1) return 0;
        if(r==arr.length-1 && c==arr[0].length-1) return 1;
        if(dpa[r][c]!=-1) return dpa[r][c];
        int bottom=dp(arr,r+1,c,dpa);
        int right=dp(arr,r,c+1,dpa);

        return dpa[r][c]=bottom + right;
    }
}
