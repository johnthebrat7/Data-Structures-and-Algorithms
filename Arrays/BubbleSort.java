import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[ ] a={12,3,43,4,55,7};
        bubble(a);
        System.out.println(Arrays.toString(a));
    }

    static void bubble(int[]a){
        boolean swapped;
        for(int i=0;i<a.length-i;i++){
            swapped=false;
            for(int j=1;j<a.length-i;j++){
                if(a[j]<a[j-1]){
                    int t=a[j];
                    a[j]=a[j-1];
                    a[j-1]=t;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

}
