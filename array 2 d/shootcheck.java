
import java.util.Scanner;

public class shootcheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int loop = sc.nextInt();
        int in = 0, out = 0;
        for (int i = 0; i < loop; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            if (r > 0 && c > 0 && r <= R && c <= C) {
                in++;
            } else {
                out++;
            }
        }
        System.out.println(in +"\n"+ out);
    }
}
