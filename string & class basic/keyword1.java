import java.util.Scanner;

public class keyword1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        String[] words = new String[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            boolean isKeyword = false;
            for (int j = 0; j < count; j++) {
                if (word.equalsIgnoreCase(words[j])) {
                    isKeyword = true;
                }
            }
            if (!isKeyword) {
                words[count] = word;
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
