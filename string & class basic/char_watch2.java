
import java.util.Scanner;

public class char_watch2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        int k = sc.nextInt();
        String[] text = new String[k];
        for (int i = 0; i < k; i++) {
            text[i] = sc.next();
        }
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        char c1 = s1.charAt(0);
        char c2 = s2.charAt(0);
        char c3 = s3.charAt(0);
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < text[i].length(); j++) {
                char keep = text[i].charAt(j);
                if (keep == c1) {
                    for (int m = 0; m < n; m++) {
                        if (num[m] == j + 1) {
                            count1++;
                        }
                    }
                }
                if (keep == c2) {
                    for (int m = 0; m < n; m++) {
                        if (num[m] == j + 1) {
                            count2++;
                        }
                    }
                }
                if (keep == c3) {
                    for (int m = 0; m < n; m++) {
                        if (num[m] == j + 1) {
                            count3++;
                        }
                    }
                }
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
    }
}
