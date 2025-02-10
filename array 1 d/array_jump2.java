
import java.util.Scanner;

public class array_jump2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            arr[i] = sc.nextInt();
        }

        int jump = k;
        for (int i=jump; i < n+1; i++) {
            if(jump >=n+1){
                System.out.println("out of bounds");
                break;
            }
            System.out.println(jump + " " + arr[jump]);
            jump += arr[jump];
        }
    }
}
