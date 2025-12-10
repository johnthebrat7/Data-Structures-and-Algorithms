import java.util.Arrays;

public class CyclicFirstMissing {
    public static void main(String[] args) {
        int [] a={1,2,3,4,8,9,-10,-4,7,5};
        sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(myAns(a));


    }
    static void sort(int [] a){
        for(int i=0;i<a.length;i++){
            while(a[i]>0 && a[i]<a.length){
                while(i!=a[i]-1 && a[i]>0){
                    int correct=a[i]-1;
                    if(a[i]==a[correct]){
                        break;
                    }
                    int t=a[i];
                    a[i]=a[t-1];
                    a[t-1]=t;
                }
                if(a[i]-1==i){
                    break;
                }
            }
        }
    }
    static int myAns(int [] a){
        for(int i=0;i<a.length;i++){
            if(a[i]-1!=i){
                return i+1;
            }
        }
        return -1;
    }
    /////    Kunals Solution

    static int missingNumber(int [] a){
        int i=0;
        while(i<a.length){
            int correct=a[i]-1;
            if((a[i]>0) && a[i]<a.length && a[i]!=correct){
                swap(a,i,correct);
            }
            else{
                i++;
            }
        } for(int j=0;j<a.length;j++){
            if(a[j]!=j){
                return j+1;
            }
        }
        return 0;
    }
    private static void swap(int [] a,int i,int correct){
        int t=a[i];
        a[i]=a[correct];
        a[correct]=t;
    }
}
