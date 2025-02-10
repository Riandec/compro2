
import java.util.Scanner;

public class array_exploration2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r + 1][c + 1];
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        int[] kr = new int[k];
        int[] kc = new int[k];
        int count_pos = 0;
        int count_neg = 0;
        int count_even = 0;
        int count_odd = 0;
        int repeat = 0;
        for (int h = 0; h < k; h++) {
            kr[h] = sc.nextInt();
            kc[h] = sc.nextInt();
            if (kr[h] < 1 || kr[h] >= r + 1 || kc[h] < 1 || kc[h] >= c + 1) {
                repeat++;
                int value = arr[kr[h - repeat]][kc[h - repeat]];
                if (value % 2 == 0) {
                    count_even++;
                    if (value > 0) {
                        count_pos++;
                    } else if (value < 0) {
                        count_neg++;
                    }
                } else {
                    count_odd++;
                    if (value > 0) {
                        count_pos++;
                    } else if (value < 0) {
                        count_neg++;
                    }
                }
            } else {
                repeat = 0;
                if (arr[kr[h]][kc[h]] > 0) {
                    count_pos++;
                    if (arr[kr[h]][kc[h]] % 2 == 0) {
                        count_even++;
                    } else if (arr[kr[h]][kc[h]] % 2 != 0) {
                        count_odd++;
                    }
                } else if (arr[kr[h]][kc[h]] < 0) {
                    count_neg++;
                    if (arr[kr[h]][kc[h]] % 2 == 0) {
                        count_even++;
                    } else if (arr[kr[h]][kc[h]] % 2 != 0) {
                        count_odd++;
                    }
                } else if (arr[kr[h]][kc[h]] == 0) {
                    count_even++;
                }
            }
        }
        System.out.println(count_pos +" "+ count_neg +" "+ count_even +" "+ count_odd);
    }
}
