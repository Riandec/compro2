
import java.util.Scanner;

public class target_land {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1; i < n+1; i++){
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
//        int[] brr = new int[q];
        for(int i = 0; i < q; i++){
            int k = sc.nextInt();
            int m = sc.nextInt();
            if(m - (k/2) <=0 || m + (k/2) >= n+1){
                System.out.println("no");
            }else{
                int sum = 0;
                for(int j = m - (k/2); j <= m + (k/2); j++){
                    sum += arr[j];
                }
                System.out.println(sum);
            }
        }
    }
}
