import java.util.Arrays;
// did notcomplete this
public class CycleMissing {
    public static void main(String[] args) {
        int [] a={4,3,2,7,8,2,1};
        sort(a);
        System.out.println(checker(a));
//        System.out.println(Arrays.toString(a));
    }
    static void sort(int [] a){
        for(int i=0;i<a.length;i++){
            while(i!=a[i]-1){
                if(a[i]==a.length){
                    break;
                }
                int t=a[i];
                a[i]=a[t];
                a[t]=t;
            }
        }
    }
    static int checker(int [] a){
        for(int i=0;i<a.length;i++){
            if(i!=a[i]){
                return i;
            }
        }
        return -1;
    }
}
