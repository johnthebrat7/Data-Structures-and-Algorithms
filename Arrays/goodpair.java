import java.util.Scanner;

public class goodpair {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=s.nextInt();
        int [] a= new int [n];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<j){
                    count++;
                }
            }
        }
    }
}
