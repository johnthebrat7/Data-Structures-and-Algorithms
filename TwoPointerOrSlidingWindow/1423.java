class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int s=cardPoints.length-k;
        int e=cardPoints.length-1;
        int sum=0;
        int max=0;
        int sum1=0;
        for(int i=s;i<=e;i++){
            sum+=cardPoints[i];
        }
        max=sum;
        
        s++;e++;
        
        while(s!=1){
            if(s>=cardPoints.length) s=s%cardPoints.length;
            if(e>=cardPoints.length) e=e%cardPoints.length;

            if(s==0){
                sum=sum-cardPoints[cardPoints.length-1]+cardPoints[e];
                max=Math.max(max,sum);
                s++;e++;
            }
            else {
                sum=sum-cardPoints[s-1]+cardPoints[e];
                max=Math.max(max,sum);
                s++;e++;
            }
            
        }
        return max;
        
    }
}
