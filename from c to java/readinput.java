
import java.util.Scanner;


public class readinput {
    public static void main(String[] args) {
        /* auto import
            1. type Scanner
            2. alt + enter
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int a=sc.nextInt(); // read an integer
//        float b=sc.nextFloat();
//        double c=sc.nextDouble(); // read a double
//        String d=sc.next(); // read a word
//        String e=sc.nextLine(); // read a line
        
        System.out.println("a=" +a);
    }
 
}
