
import java.util.Scanner;

class Blade{
    int size, num, angle;
    double hp;
    boolean valid = true;
    
    public Blade(int size, int num, int angle, double hp){
        this.size = size;
        this.num = num;
        this.angle = angle;
        this.hp = hp;
        if(size < 16 || size > 24 || size % 2 == 1){
            valid = false;
            System.out.println("invalid size");
        }
        if(num < 3 || num > 5){
            valid = false;
            System.out.println("invalid number of blades");
        }
        if(angle != 27 && angle != 30 && angle != 33){
            valid = false;
            System.out.println("invalid angle");
        }
        if(hp <= 0){
            valid = false;
            System.out.println("invalid horsepower");
        }
    }
    
    void printInfo(){
        System.out.println(size+" "+num+" "+angle+" "+hp+" "+valid);
    }
}

class Motor {

    double V, I, eff;

    Motor(double V, double I, double eff) {
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

class ElectricFan{
    int productID;
    Blade blade;
    Motor motor;
    boolean status;
    static int count = 0;
    
    public ElectricFan(Blade blade, Motor motor){
        count++;
        productID = count;
        this.blade = blade;
        this.motor = motor;
        if(motor.horsepower() >= blade.hp){
            status = true;
        }else{
            status = false;
        }
    }
    
    boolean changeBlade(Blade blade){
        this.blade = blade;
        if(motor.horsepower() >= blade.hp){
            status = true;
        }else{
            status = false;
        }
        return status;
    }
    
    boolean changeMotor(Motor motor){
        this.motor = motor;
        if(motor.horsepower() >= blade.hp){
            status = true;
        }else{
            status = false;
        }
        return status;
    }
    
    void printInfo(){
        System.out.println(productID+" "+blade.size+" "+blade.hp+" "+motor.I+" "+String.format("%.2f", motor.horsepower())+" "+status);
    }
}

public class FanCompany3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size, numb, angle;
        double hp, v, i, eff;
        Blade ablade = null;
        Motor motor = null;
        ElectricFan eFan = null;
        for (int index = 0; index < n; index++) {
            int cmd = sc.nextInt();
            if (cmd == 0) {
                size = sc.nextInt();
                numb = sc.nextInt();
                angle = sc.nextInt();
                hp = sc.nextDouble();
                ablade = new Blade(size, numb, angle, hp);
                v = sc.nextDouble();
                i = sc.nextDouble();
                eff = sc.nextDouble();
                motor = new Motor(v, i, eff);
                eFan = new ElectricFan(ablade,motor);
            } else if (cmd == 1) {
                size = sc.nextInt();
                numb = sc.nextInt();
                angle = sc.nextInt();
                hp = sc.nextDouble();
                ablade = new Blade(size, numb, angle, hp);
                eFan.changeBlade(ablade);
            } else if (cmd == 2) {
                v = sc.nextDouble();
                i = sc.nextDouble();
                eff = sc.nextDouble();
                motor = new Motor(v, i, eff);
                eFan.changeMotor(motor);
            }
            eFan.printInfo();
        }
    }
}
