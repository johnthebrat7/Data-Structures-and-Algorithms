public class FindingIndices {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,3,2,1};
        System.out.println(search(a,3));
    }
    static int search(int []a,int t){
        int peak=greatest(a);
        int firstTry=finder(a,0,peak,t);
        if(firstTry!=-1){
            return firstTry;
        }
        return finder(a,peak+1,a.length-1,t);
    }
    static int greatest(int[] a){
        int start=0;
        int end=a.length-1;
        while(start!=end){
            int mid=start+(end-start)/2;
            if(a[mid]>a[mid+1]){
                end=mid;
            }
            if(a[mid]<a[mid+1]){
                start=mid+1;
            }
        }
        return start;
    }
    static int finder(int[]a,int first,int last,int t){
         first=0;
         last=a.length-1;
        while(last>first){
            int mid1=first+(last-first)/2;
            if(a[mid1]>t){
                last=mid1-1;
            }
            if(a[mid1]<t){
                first=mid1+1;
            }
            if(mid1==t){
                return mid1;
            }
        }
        return -1;
    }
}
