
import java.util.Scanner;

public class index_of_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.next();
        int index = text1.indexOf(text2);
        if(index >= 0){
            System.out.println(index+1);
        }else{
            System.out.println("string not found");
        }
    }
}
