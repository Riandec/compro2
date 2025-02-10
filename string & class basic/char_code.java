
import java.util.Scanner;

public class char_code {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        char c = 'A'; // char to A
        String tmp = sc.next();
        char c = tmp.charAt(0);
        int valC = (int) c; // char to int
        System.out.println(valC);
    }
}
