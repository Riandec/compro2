
import java.util.Scanner;

public class int_to_char {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();
        if(code >= (int)'A' && code <= (int)'Z'){
            System.out.println((char) code);
        }else{
            System.out.println("unsupported code");
        }
    }
}
