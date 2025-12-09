import java.util.Scanner;

public class ArrayFloor {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter target:");
        int t = S.nextInt();
        int[] a = {12, 33, 45, 66, 78, 98, 100};
        System.out.println(binary(a, t));

    }

    static int binary(int[] a, int t) {
        int s = 0;

        int f = a.length - 1;

        while (f >= s) {
            int mid = s + (f - s) / 2;
            if (a[mid] > t) {
                f = mid - 1;
            } else if (a[mid] < t) {
                s = mid + 1;
            } else {
                return mid;
            }
        }
        return a[f];
    }
}