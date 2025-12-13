public class CyclicMismatchKunal {
    public static void main(String[] args) {

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
