import java.util.ArrayList;
import java.util.Arrays;

public class CyclisSortDeleted {
    public static void main(String[] args) {
        int [] a={2,1,4,4,6,5};
        sort(a);
//        ArrayList<Integer> List=new ArrayList<>();
//
//        for(int i=0;i<a.length;i++){
//            if(a[i]-1!=i){
//                List.add(a[i]);
//                List.add(i+1);
//            }
//        }
//        System.out.println(List);
        System.out.println(Arrays.toString(myAnswer(a)));
        System.out.println(Arrays.toString(a));


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
    static int [] myAnswer(int [] a){
        int x=0;
        int y=0;
        for(int i=0;i<a.length;i++){
            if(a[i]-1!=i){
                x=a[i];
                y=i+1;
                return new int [] {x,y};

            }
        }
        return new int[]{-1,-1};
    }

}
