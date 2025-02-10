
import java.util.Scanner;

public class wordstats2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] min = new int[26];
        int[] max = new int[26];
        for(int i = 0; i < 26; i++){
            min[i] = 501;
        }
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            int first = (int)word.charAt(0)-65;
            max[first] = Math.max(max[first],word.length());
            min[first] = Math.min(min[first], word.length());
        }
        for (int i = 0; i < 26; i++) {
            if (max[i] > 0 || min[i] < 0) {
                System.out.println((char) (i + 65) + " " + min[i] + " " + max[i]);
            }
        }
    }
}
