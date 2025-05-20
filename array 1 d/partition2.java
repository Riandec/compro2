import java.util.Scanner;

public class partition2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int center = a[n / 2];
        int[] b = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] <= center) {
                b[count] = a[i];
                count++;
            }
        }

        center = b[count / 2];
        for (int i = 0; i < count; i++) {
            if (b[i] <= center) {
                System.out.print(b[i] + " ");
            }
        }
        System.out.println("");
        for (int i = 0; i < count; i++) {
            if (b[i] > center) {
                System.out.print(b[i] + " ");
            }
        }
    }
}
