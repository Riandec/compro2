import java.util.Scanner;

public class CutHalfRecursive {
    public static String cutHalf(String s) {
        if (s.length() <= 1) {
            return s;
        } else {
            int mid = s.length() / 2;
            return s.charAt(mid) + cutHalf(s.substring(0, mid)) + cutHalf(s.substring(mid+1, s.length()));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next(); 
        System.out.println(cutHalf(str)); 
    }
}
