package DynamicProgramming;
import java.util.*;
public class MatrixChainMultiplication {
    public static void main(String [] args) {
        int [][] arr ={{1,2},{2,3},{3,4}};
        System.out.println(cost(0,arr.length-1,arr));
    }
    public static int cost(int i,int j,int [][] arr){
        if(i==j) return 0;
        int minCost=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int x=arr[i][0] * arr[k][1] *arr[j][1];
            int totalCost=cost(i,k,arr) +cost(k+1,j,arr)+x;
            minCost=Math.min(minCost,totalCost);
        }
        return minCost;
    }
}
