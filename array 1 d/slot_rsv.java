
import java.util.Scanner;

public class slot_rsv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr1 = new int[n + 1];
        int[] arr2 = new int[n + 1];
        int p = sc.nextInt();
        for (int i = 1; i <= p; i++) {
            int x = sc.nextInt();
            if (arr1[x] < k) {
                arr1[x]++;
                System.out.println("1");
            } else if (arr1[x] >= k) {
                arr2[x]++;
                System.out.println("2");
            }
        }
        for (int i = 1; i < n + 1; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");
        for (int i = 1; i < n + 1; i++) {
            System.out.print(arr2[i] +" ");
        }
    }
}
