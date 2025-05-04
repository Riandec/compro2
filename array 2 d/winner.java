import java.util.Scanner;

public class winner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] map = new int[R][C];
        int totalShip = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                map[i][j] = sc.nextInt();
                totalShip += map[i][j];
            }
        }
        int K = sc.nextInt();
        int count_ship = 0;
        int count_miss = 0;
        int count_ship2 = 0;
        int count_miss2 = 0;
        int count_out = 0;
        int first_hit = -1;
        int last_hit = -1;
        for (int i = 0; i < K; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            if (r > 0 && c > 0 && r <= R && c <= C) {
                if (map[r - 1][c - 1] == 1) {
                    count_ship++;
                    if (first_hit == -1) {
                        first_hit = i + 1;
                    }
                    last_hit = i + 1;
                    map[r - 1][c - 1] = -1;
                } else if (map[r - 1][c - 1] == -1) {
                    count_ship2++;
                    
                } else if (map[r - 1][c - 1] == 0) {
                    count_miss++;
                    map[r - 1][c - 1] = -2;
                } else if (map[r - 1][c - 1] == -2) {
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

        int remainShip = totalShip - count_ship;
        if (remainShip == 0) {
            System.out.println("attacker " + last_hit);
        } else {
            System.out.println("battleship " + first_hit);
        }
    }
}
