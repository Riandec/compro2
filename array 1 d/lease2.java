
import java.util.Scanner;

public class lease2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }
        int year = sc.nextInt();
        int nyear = sc.nextInt();
        int[] x = new int[nyear];
        for (int j = 0; j < nyear; j++) {
            x[j] = sc.nextInt();
        }

        for (int i = 0; i < nyear; i++) { // question
            int count = 0;
            for (int j = 0; j < n; j++) { // every room
                int fi = y[j] + year - 1;
                if (x[i] > fi) {
                    System.out.print(j+1 +" ");
                    count++;
                }
            }
            if(count==0){
                System.out.println("full");
            }
            System.out.println("");
        }
    }
}
