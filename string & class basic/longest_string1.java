
import java.util.Scanner;

public class longest_string1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            String str = sc.nextLine();
            if (str.length() > max) {
                max = str.length();
            }
        }
        System.out.println(max);
    }
}
