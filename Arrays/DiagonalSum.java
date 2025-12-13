import java.util.Arrays;
import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("size of array");
        int n=s.nextInt();
        int [][] a= new int [n][n];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=s.nextInt();
            }
        }

        int sum=0;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(i==j){
                    sum+=a[i][j];
                }
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum is = "+ sum);
    }
}
