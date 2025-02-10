
import java.util.Scanner;

public class numtable2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[R + 1][C + 1];
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        int dup = -1;
        int n = sc.nextInt();
        for (int k = 0; k < n; k++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            if (r < 1 || r >= R + 1 || c < 1 || c >= C + 1) {
                count++;
                if (k > 0) {
                    if (count < 2) {
                        System.out.println("");
                    }
                }
                dup = -1;
            } else {
                count = 0;
                if (arr[r][c] == dup) {
                    System.out.print("*");
                } else {
                    System.out.print(arr[r][c]);
                    dup = arr[r][c];
                }
            }
        }
    }
}
