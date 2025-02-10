
import java.util.Scanner;

public class longest_count {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (;;) {
            String text = sc.nextLine();
            if (text.length() == 0) {
                break;
            }
            if (text.length() > max) {
                max = text.length();
                count = 1;
            }else if (max == text.length()) {
                count++;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
