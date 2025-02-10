
import java.util.Scanner;

public class ppap1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pp = "PPAP";
        String god = "GOD";
        if(text.indexOf(pp) == -1){
            System.out.println("clean");
        }else if(text.indexOf(god) < text.indexOf(pp) && text.lastIndexOf(god) > text.lastIndexOf(pp)){
            System.out.println("safe");
        }else{
            System.out.println("danger");
        }
    }
}
