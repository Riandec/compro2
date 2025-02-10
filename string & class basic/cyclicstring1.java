
import java.util.Scanner;

public class cyclicstring1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < text.length(); j++) {
                count++;
                if (count <= n) {
//                    System.out.println(text.charAt(j) + " " + count);
                    System.out.print(text.charAt(j));
                }
            }
        }
    }
}
