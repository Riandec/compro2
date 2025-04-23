import java.util.Scanner;

public class thevoicesu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int selected1 = 0, selected2 = 0;
        for (int i = 1; i <= N; i++) {
            int gender = sc.nextInt();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();

            if (score1 >= 9 && score2 < 9 && selected1 < K) {
                System.out.println(i + " 1");
                selected1++;
            } else if (score2 >=9 && score1 < 9 && selected2 < K) {
                System.out.println(i + " 2");
                selected2++;
            } else if (score1 >= 9 && score2 >= 9 ) {
                if (selected1 < K && selected2 < K) {
                    if (gender == 1) {
                        System.out.println(i + " 1");
                        selected1++;
                    } else {
                        System.out.println(i + " 2");
                        selected2++;
                    }
                } else if (selected1 < K) {
                    System.out.println(i + " 1");
                    selected1++;
                } else if (selected2 < K) {
                    System.out.println(i + " 2");
                    selected2++;
                }
            }
        }
    }
}
