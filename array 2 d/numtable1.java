
import java.util.Scanner;

public class numtable1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[R+1][C+1];
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        for (int k = 0; k < n; k++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            if(r < 1 || r >= R+1 || c < 1 || c >= C+1){
                System.out.print("-");
            }else{
                System.out.print(arr[r][c]);
            }
        }
    }
}
