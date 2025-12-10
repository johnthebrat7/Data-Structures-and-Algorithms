import java.util.Scanner; // mountain array

public class BitonicArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [] a={0,1,3,5,7,4,2};
        System.out.println(bs1(a));
    }
    static int bs(int [] a){
        int start=0;
        int end=a.length-1;
        int mid=0;
        while(start!=end){
            mid=start+(end-start)/2;
            if(a[mid]>a[mid+1]){     // a[mid]>a[mid+1]
                end=mid;// ye jagha important hai;
            }
            if(a[mid]<a[mid+1]){
                start=mid+1;
            }
        }
        return a[start];
    }
    public static int bs1(int [] a){
        int s=0;
        int e=a.length-1;
        int m=0;
        while(s<=e){
            m=s+(e-s)/2;
            if(a[m]>a[m-1] && a[m]>a[m+1]) return a[m];
            else if(a[m]>a[m-1]) s=m+1;
            else if(a[m]>a[m+1]) e=m;
        }
        return a[s];
    }
}
