
import java.util.Scanner;

public class submatch1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String sub = sc.next();
        for (int i = 0; i < 3; i++) {
            int find = text.indexOf(sub.substring(i, i+3));
            if(find >= 0){
                System.out.println(find+1);
            }else{
                System.out.println("No");
            }
        }
    }
}
