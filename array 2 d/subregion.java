import java.util.Scanner;

public class subregion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(), C = sc.nextInt(),
        P = sc.nextInt(), Q = sc.nextInt(),
        H = sc.nextInt(), W = sc.nextInt();
        int[][] arr = new int[R][C];
        if (P <= 0 || P > R || Q <= 0 || Q > C || P+(H-1) > R || Q+(W-1) > C) {
            System.out.println("invalid input");
        }else {
            for (int i = P-1; i < P+(H-1); i++) {
                for (int j = Q-1; j < Q+(W-1); j++) {
                    arr[i][j] = 1;
                }
            }
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {    
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
