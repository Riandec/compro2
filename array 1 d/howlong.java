
import java.util.Scanner;

public class howlong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int[] brr = new int[4];
        for (int i = 1; i < n+1; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 1; i < 4; i++){
            brr[i] = sc.nextInt();
        }
        
        for(int i = 1; i < 4; i++){
            int count = 0;
            for(int j = brr[i] ; j < n+1; j++){
                if(arr[j] == 0){
                    break;
                }
                count++;
            }
            System.out.println(count);
        }
    }
}
