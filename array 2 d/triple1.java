
import java.util.Scanner;

public class triple1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int v = sc.nextInt();

        for (int i = 0; i < r; i++) {
            int count = 0;
            for (int j = 0; j < c; j++) {
                if(arr[i][j] == v){
                    count++;
                }else if(count < 3){
                    count=0;
                }
            }
            if(count >= 3){
                System.out.print(i+1 +" ");
            }
        }
    }
}
