import java.util.Scanner;

public class UnderLineWithParameter {
    static void underline(int n){
        for(int i=0;i<n;i++){
            System.out.print("-");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i=0;i<number;i++){
            String name = sc.next();
            int n = sc.nextInt();
            System.out.println(name);
            underline(n);
        }
    }
}
