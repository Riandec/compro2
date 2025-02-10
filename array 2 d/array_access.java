
import java.util.Scanner;

public class array_access {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][];
        int[] k = new int[n];
        for (int i = 0; i < n; i++) {
            k[i] = sc.nextInt();
            arr[i] = new int[k[i]];
            for (int j = 0; j < k[i]; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int out = 0;
        for (;;) {
            int choose = sc.nextInt();
            if (choose == 0) {
                break;
            }
            int index = sc.nextInt();
            boolean inrange = false;
            if (choose > 0 && choose <= n) {
                if (index >= 0 && index < k[choose - 1]) {
                    sum += arr[choose - 1][index];
                    if (arr[choose - 1][index] > max) {
                        max = arr[choose - 1][index];
                    }
                    if (arr[choose-1][index] < min) {
                        min = arr[choose - 1][index];
                    }
                    inrange = true;
                }
            }
            if(!inrange){
                out++;
            }
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        System.out.println(out);
    }
}
