import java.util.Scanner;

public class cumulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < k; i++) {
            int begin = sc.nextInt();
            int end = sc.nextInt();
            int add = sc.nextInt();

            for (int j = begin; j <= end; j++) {
                arr[j] += add;
            }
            for (int m = 1; m <= n-1; m++) {
                System.out.print(arr[m] + " ");
            }
            System.out.println();
        }
    }
}