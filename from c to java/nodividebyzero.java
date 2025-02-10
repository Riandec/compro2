import java.util.Scanner;

public class nodividebyzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        if (z != 0){
            System.out.printf("%.6f",(x+y)/z);
        } else {
            System.out.println("cannot divide by zero");
        }
    }
}
