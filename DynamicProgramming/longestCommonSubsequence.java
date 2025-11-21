class Solution {
    public int count=0;
    public int longestCommonSubsequence(String text1, String text2) {
        int [][] dp=new int [text1.length()][text2.length()];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return rec(text1,text2,0,0,dp);
    }
    public int rec(String text1, String text2,int idx1,int idx2,int [][] dp){
        if(idx1==text1.length() || idx2==text2.length()) return 0;
        if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];
        char c1=text1.charAt(idx1);
        char c2=text2.charAt(idx2);
        if(c1==c2){
            return dp[idx1][idx2]=1+rec(text1,text2,idx1+1,idx2+1,dp);  
        }
        int skip1=rec(text1,text2,idx1+1,idx2,dp);
        int skip2=rec(text1,text2,idx1,idx2+1,dp);
        return dp[idx1][idx2]=Math.max(skip1,skip2);
    }
}
