import java.util.Arrays;
import java.util.Scanner;

public class BinaryASearch2D {
    public static void main(String[] args) {
        int [][] a={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}};
        Scanner s= new Scanner(System.in);
        System.out.println("Enter target:");
        int t=s.nextInt();
        System.out.println(Arrays.toString(search(a,t)));
    }
    static int [] search(int[][]a,int t){
        int c=a.length-1;
        int r=0;

        while(c>=0 && r<=a.length-1){
            if(a[r][c]==t){
                return new int[]{r, c};
            }
            if (a[r][c]>t) {
                c--;
            }
            if(t>a[r][c]){
                r++;
            }
        }
        return new int[]{-1,-1};
    }

}
