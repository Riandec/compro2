
import java.util.Scanner;

public class winner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] map = new int[R + 1][C + 1];
        int totalShip = 0;
        for (int r = 1; r <= R; ++r) {
            for (int c = 1; c <= C; ++c) {
                map[r][c] = sc.nextInt();
                totalShip += map[r][c];
            }
        }
        /*
        Shot map (initial value = false)
        define:
            false -> not shot
            true -> shot
         */
        boolean[][] shotMap = new boolean[R + 1][C + 1];

        // Counter
        int first = 0; // first hit
        int firstMiss = 0; // first miss
        int same = 0; // the same hit
        int sameMiss = 0; // the same miss
        int out = 0; // out of map

        int firsthit = -1;
        int lasthit = -1;

        int K = sc.nextInt();
        for (int k = 0; k < K; ++k) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            boolean validRow = (1 <= r) && (r <= R);
            boolean validCol = (1 <= c) && (c <= C);

            // out of map
            if (!validRow || !validCol) {
                ++out;
                continue;
            }

            boolean hit = (map[r][c] == 1);
            boolean wasShot = shotMap[r][c];
            if (hit) {
                // first hit
                if (!wasShot) {
                    ++first;
                    shotMap[r][c] = true;

                    if (firsthit == -1) {
                        firsthit = k + 1;
                    }

                    lasthit = k + 1;
                } // the same hit
                else {
                    ++same;
                }
            } else {
                // first miss
                if (!wasShot) {
                    ++firstMiss;
                    shotMap[r][c] = true;
                } // the same miss
                else {
                    ++sameMiss;
                }
            }
        }
        System.out.println(first);
        System.out.println(firstMiss);
        System.out.println(same);
        System.out.println(sameMiss);
        System.out.println(out);

        int remainShip = totalShip - first;
        if (remainShip > 0) {
            System.out.println("battleship " + firsthit);
        } else {
            System.out.println("attacker " + lasthit);
        }
    }
}
