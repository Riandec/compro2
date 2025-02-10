
import java.util.Scanner;

public class auction2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                b[j] = sc.nextInt();
                if (b[j] > a[j] && count[j] < 3) {
                    a[j] = b[j];
                    count[j] = 0;
                } else {
                    count[j]++;
                }
                System.out.print(a[j] + " ");
            }
            System.out.println("");
        }
    }

}
