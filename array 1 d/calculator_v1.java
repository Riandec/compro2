import java.util.Scanner;

public class calculator_v1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int[] history = new int[10];
        int result = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (;;) {
            int order = sc.nextInt();
            if (order == 0) {
                break;
            } else if (order == 1) {
                int index1 = sc.nextInt();
                int index2 = sc.nextInt();
                if (index1 >= 0 && index1 < arr.length &&
                    index2 >= 0 && index2 < arr.length) {
                    sum = arr[index1]+arr[index2];
                    System.out.println(sum);
                    history[count] += sum;
                    count++;
                } else {
                    System.out.println("error");
                }
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(history[i] + " ");
            result += history[i];
        }
        System.out.println();
        System.out.println(result);
    }
}