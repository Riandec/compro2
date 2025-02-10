
import java.util.Scanner;

public class up_sequence0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(i == n-1){
                System.out.println(num[i]);
            }else if(num[i] >= num[i+1]){
                System.out.println(num[i]);
            }
        }
    }
}
