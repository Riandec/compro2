/*
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

public class FanCompany1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int num = scan.nextInt();
        int angle = scan.nextInt();
        double hp = scan.nextDouble();
        Blade blade = new Blade(size,num,angle,hp);
        blade.printInfo();
    }
}
*/