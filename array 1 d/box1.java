
import java.util.Scanner;

public class box1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1]; //capacity of box
        for (int i = 1; i < n+1; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt(); // amount order
        int[] inside = new int[n+1]; // amount of stuff in the box
        for (int j = 0; j < k; j++) {
            int order = sc.nextInt();
            int q = sc.nextInt(); // amount of stuff order
            int b = sc.nextInt(); // box number order
            if(order == 1){ // put
                if(inside[b] < arr[b] && q <= arr[b] - inside[b]){
                    inside[b] += q;
                    System.out.println(inside[b]);
                }else{
                    System.out.println("-1");
                }
            }
            if(order ==2){
                if(q <= inside[b]){
                    inside[b] -= q;
                    System.out.println(inside[b]);
                }else{
                    System.out.println("-1");
                }
            }
        }
    }
}
