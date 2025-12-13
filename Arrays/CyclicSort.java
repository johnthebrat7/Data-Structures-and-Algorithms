import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int []a={5,4,3,2,1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    static void sort(int [] a){
        for(int i=0;i<a.length;i++){
            while(i!=a[i]-1){
                int t=a[i];
                a[i]=a[t-1];
                a[t-1]=t;
            }

        }
    }
    static void sort2(int [] a){
        int i=0;
        while(i<a.length){
            int correct=a[i]-1;
            if(a[i]!=a[correct]){
                swap(a,i,correct);

            }
            else{
                i++;
            }
        }
    }
    private static void swap(int [] a,int i,int correct){
        int t=a[i];
        a[i]=a[correct];
        a[correct]=t;
    }
}
