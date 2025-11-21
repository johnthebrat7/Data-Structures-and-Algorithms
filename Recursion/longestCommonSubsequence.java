class Solution {
    public int count=0;
    public int longestCommonSubsequence(String text1, String text2) {
        
        return rec(text1,text2,0,0);
    }
    public int rec(String text1, String text2,int idx1,int idx2){
        if(idx1==text1.length() || idx2==text2.length()) return 0;
        char c1=text1.charAt(idx1);
        char c2=text2.charAt(idx2);
        if(c1==c2){
            return 1+rec(text1,text2,idx1+1,idx2+1);  
        }
        int skip1=rec(text1,text2,idx1+1,idx2);
        int skip2=rec(text1,text2,idx1,idx2+1);
        return Math.max(skip1,skip2);
    }
}
