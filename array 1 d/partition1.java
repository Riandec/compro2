
import java.util.Scanner;

public class partition1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int center = a[n / 2];
        for (int i = 0; i < n; i++) {
            if (a[i] <= center) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            if(a[i]>center){
                System.out.print(a[i] +" ");
            }
        }
    }
}
