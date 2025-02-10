/*
import java.util.Scanner;

class Motor {

    double V, I, eff;

    Motor(double V, double I, double eff) {
//        this(V,I,eff/100);
          this.V = V;
          this.I = I;
          this.eff = eff/100;
    }

    Motor(double I, double eff) {
        this(220,I,eff/100);
 }
    double horsepower() {
        return (V * I * eff) / 746;
    }

    void printInfo() {
        double hp =  horsepower();
        System.out.println(V + " " + I + " " + eff + " " + String.format("%.2f", hp));
    }
}

public class FanCompany2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        double i = sc.nextDouble();
        double eff = sc.nextDouble();
        Motor motor = null;
        if (v == 220) {
            motor =  new Motor(220,i,eff);
        } else {
            motor = new Motor(v, i, eff);
        }
        motor.printInfo();
    }
}
*/