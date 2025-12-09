import java.util.Scanner;

public class BinarySearch1D {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the target element:");
        int t=s.nextInt();
        int [] a={12,23,43,73,90,98,134};
        System.out.println(bs(a,t));


    }
    static int bs(int [] a, int t){
        int i=0;
        int f=a.length-1;

        while(f>=i){
            int mid= i+(f-i)/2;
            if(t>a[mid]){
                i=mid+1;
            }
            else if(t<a[mid]){
                f=mid-1;
            }
            else {
                return mid;
            }


        }
        return -1;
    }
}
