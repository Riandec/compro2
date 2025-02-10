
import java.util.Scanner;

public class lease1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }
        int year = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(year+y[i]-1 +" ");
        }
    }
}
