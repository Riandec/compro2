
import java.util.Scanner;

public class ThreeNumber {

    int[] num = new int[3];

    int process(int choose) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        int result = 0;
        if (choose == -1) {
            result = min;
        } else if (choose == 1) {
            result = max;
        } else if (choose == 0) {
            for (int i = 0; i < 3; i++) {
                if (num[i] != max && num[i] != min) {
                    result = num[i];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThreeNumber th = new ThreeNumber();
        for (int i = 0; i < 3; i++) {
            th.num[i] = sc.nextInt();
        }
        int choose = sc.nextInt();
        int r = th.process(choose);
        System.out.println(r);
    }
}
