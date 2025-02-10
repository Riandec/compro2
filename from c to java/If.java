
import java.util.Scanner;


public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int th=0;
        if(n<th){
            System.out.println("less than "+th);
        }else if(n==th){
            System.out.println("equal to "+th);
        }else{
            System.out.println("more than "+th);
        }
    }
}
