
import java.util.Scanner;

public class labor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int[] brr = new int[n+1];
        for(int i = 1; i < n+1; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 1; i < n+1; i++){
            brr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int k = sc.nextInt();
            int m = sc.nextInt();
            if(m - (k/2) <=0 || m + (k/2) >= n+1){
                System.out.print("no ");
                int sum2 = 0;
                for(int j = m - (k/2); j <= m + (k/2); j++){
                    if(j > 0 && j < n+1){
                        sum2 += arr[j];
                    }
                }
                System.out.println(sum2);
            }else{
                int sum = 0;
                int count = 0;
                int labor = 0;
                for(int j = m - (k/2); j <= m + (k/2); j++){
                    sum += arr[j];
                    count++;
                    if(brr[j] >= 5){
                        labor++;
                    }
                }
                if(labor == count){
                    System.out.print(sum + " ");
                    System.out.println("labor");
                }else{
                    System.out.println(sum);
                }
            }
        }
    }
}
