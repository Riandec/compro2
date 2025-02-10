
import java.util.Scanner;

public class cyclicstring2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if ((i / text.length()) % 2 == 1) {
                System.out.print(text.charAt(text.length() - (i % text.length()) - 1));
            } else {
                System.out.print(text.charAt(i % text.length()));
            }
        }
    }
}
