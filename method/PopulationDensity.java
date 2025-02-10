import java.util.Scanner;

public class PopulationDensity {
    public static long density(int npeople, double area){
        double den = npeople/area;
        long result = Math.round(den);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int npeople = sc.nextInt();
        double area = sc.nextDouble();
        long d = density(npeople,area);
        System.out.println("population density is "+d);
    }
}
