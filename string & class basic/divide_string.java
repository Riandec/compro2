
import java.util.Scanner;

public class divide_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String l = ""; String u = ""; String s = "";
        for (int i = 0; i < text.length(); i++) {
            boolean low = Character.isLowerCase(text.charAt(i));
            boolean up = Character.isUpperCase(text.charAt(i));
            if (low) {
                l += text.charAt(i);
            } else if (up) {
                u += text.charAt(i);
            } else {
                s += text.charAt(i);
            }
        }
        System.out.println(l);
        System.out.println(u);
        System.out.println(s);
    }
}
