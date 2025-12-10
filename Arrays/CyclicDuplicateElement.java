import java.util.ArrayList;
import java.util.Arrays;

public class CyclicDuplicateElement {
    public static void main(String[] args) {
        int [] a={8,3,2,7,4,2,3,1};
        sort(a);
        System.out.println(Arrays.toString(a));
//        for(int i=0;i<a.length;i++){
//            if(a[i]-1!=i){
//                System.out.println(a[i] );
//            }
//        }
//        System.out.println(Arrays.toString(a));


    }
    static void sort(int [] a){
        for(int i=0;i<a.length;i++){
            while(i!=a[i]-1){
                int correct=a[i]-1;
                if(a[i]==a[correct]){
                    break;
                }
                int t=a[i];
                a[i]=a[t-1];
                a[t-1]=t;
            }
        }
    }

}
