
import java.util.Scanner;

public class count_between1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }
        int x1 = sc.nextInt(); int x2 = sc.nextInt();
        int y1 = sc.nextInt(); int y2 = sc.nextInt();
        int count1=0; int count2=0; int count3=0;
        for(int i=0;i<n;i++){
            if(num[i] >= x1 && num[i] <= x2){
                count1++;
            }else if(num[i] >= y1 && num[i] <= y2){
                count2++;
            }else{
                count3++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
    }
}
