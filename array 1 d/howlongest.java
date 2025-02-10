
import java.util.Scanner;

public class howlongest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int count = 0;
        int count_max = 0;
        for(int i = 1; i < n+1; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 1){
                count++;
            }else{
                count = 0;
            }
            
//            System.out.print(count +" ");
            if(count > count_max){
                count_max = count;
            }
        }
        System.out.println(count_max);
        
        int start = 0;
        for(int i = 1; i < n+1; i++){
            if(arr[i] == 0){
                start = i + 1;
                count = 0;
            }else{
                count++;
                if(count == count_max){
                    System.out.print(start + " ");
                }
            }
        }
    }
}
