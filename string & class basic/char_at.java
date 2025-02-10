
import java.util.Scanner;

public class char_at {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine(); // silpakorn university
        int index = sc.nextInt();
        if(index-1 < text.length() && index > 0){
            char ch = text.charAt(index-1);
            System.out.println(ch);
        }else{
            System.out.println("invalid position");
        }
    }
}
