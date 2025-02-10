
import java.util.Scanner;

public class num_occurance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (target == num[i]) {
                System.out.print(i+1 +" ");
                count++;
            }
        }
        if(count==0){
            System.out.print("0");
        }
    }
}
