
import java.util.Scanner;

public class array_exploration1 {

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
        int count_pos = 0;
        int count_neg = 0;
        int count_even = 0;
        int count_odd = 0;
        for (int h = 0; h < k; h++) {
            int kr = sc.nextInt();
            int kc = sc.nextInt();
            if (kr < 1 || kr >= r + 1 || kc < 1 || kc >= c + 1) {
//                System.out.println("No");
            } else {
//                System.out.println(arr[kr][kc]); 
                if (arr[kr][kc] > 0) {
                    count_pos++;
                    if (arr[kr][kc]%2 == 0){
                        count_even++;
                    } else if (arr[kr][kc]%2 != 0){
                        count_odd++;
                    }
                } else if (arr[kr][kc] < 0){
                    count_neg++;
                    if (arr[kr][kc]%2 == 0){
                       count_even++;
                    } else if (arr[kr][kc]%2 != 0){
                       count_odd++;
                    }
                } else if (arr[kr][kc] == 0){
                    count_even++;
                }
            }
        }
        System.out.print(count_pos +" "+ count_neg +" "+ count_even +" "+ count_odd);
    }
}
