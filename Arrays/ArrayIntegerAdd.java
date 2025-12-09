import java.util.Scanner;

public class ArrayIntegerAdd {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number to be added");
        int k=s.nextInt();
        int [] a={1,0,0};
        int n=0;
        for(int i=0;i<a.length;i++){
            n=n*10+a[i];
        }
        int sum=n+k;
        System.out.println(n);
        System.out.println(sum);
    }
}
