import java.util.Scanner;

public class reserve3vans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0, b=0, c=0;
        for(int i=0; i<n; i++){
            int time = sc.nextInt();
            if ( a<=b && a<=c){
                System.out.println("A");
                a += time;
            } else if ( b<=c){
                System.out.println("B");
                b += time;
            } else {
                System.out.println("C");
                c += time;
            }
        }
    }
}
