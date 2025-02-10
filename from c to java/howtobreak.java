
import java.util.Scanner;


public class howtobreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        while(true){
            int n=sc.nextInt(); // scanf
            if(n==0){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
