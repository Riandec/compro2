
import java.util.Scanner;

public class char_count2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] alphabet = new int[26];
        int count = 0;
        for (;;) {
            String text = sc.next(); 
            count++;
            for (int i = 0; i < text.length(); i++) {
                alphabet[text.charAt(i)-65]++;
                if (alphabet[(int) text.charAt(i)-65] == k) {
                    System.out.println(text.charAt(i));
                    System.out.println(count);
                    return;
                }
            }
        }
    }
}
