import java.util.Arrays;
import java.util.Scanner;

public class highestCandies {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n=s.nextInt();
        int [] a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();

        }
        boolean [] k= new boolean[n];
        int MaxCandies=0;
        int sum=0;
        System.out.println("Enter number of extra candies:");
        int m=s.nextInt();
        for(int i=0;i<n;i++){
            sum=a[i]+m;
            if(sum>MaxCandies){
                MaxCandies=sum;
                k[i]=true;
            }
            else{
                k[i]=false;
                MaxCandies=sum;

            }
        }
        System.out.println(Arrays.toString(k));
    }
}
