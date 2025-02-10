
import java.util.Scanner;

public class up_sequence2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        for (int i = 0; i < text.length(); i++) {
            if (i == text.length() - 1) {
                System.out.println(text.charAt(i));
            } else if ((int) text.charAt(i) >= (int) text.charAt(i + 1)) {
                System.out.println(text.charAt(i));
            } else {
                System.out.print(text.charAt(i));
            }
        }
    }
}
