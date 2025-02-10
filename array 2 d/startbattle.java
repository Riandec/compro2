
import java.util.Scanner;

public class startbattle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        int count_ship = 0;
        int count_miss = 0;
        int count_ship2 = 0;
        int count_miss2 = 0;
        int count_out = 0;
        for (int i = 0; i < k; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            if (r > 0 && c > 0 && r <= R && c <= C) {
                if (arr[r - 1][c - 1] == 1) {
                    count_ship++;
                    arr[r - 1][c - 1] = -1;

                } else if (arr[r - 1][c - 1] == -1) {
                    count_ship2++;
                }

                if (arr[r - 1][c - 1] == 0) {
                    count_miss++;
                    arr[r - 1][c - 1] = -2;
                } else if (arr[r - 1][c - 1] == -2) {
                    count_miss2++;
                }
            } else {
                count_out++;
            }
        }
        System.out.println(count_ship);
        System.out.println(count_miss);
        System.out.println(count_ship2);
        System.out.println(count_miss2);
        System.out.println(count_out);
    }
}
