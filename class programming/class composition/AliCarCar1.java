/*
import java.util.Scanner;

class Car {
    int code, price, labor;
    String name;
    
    public Car(int code, String name, int price, int labor){
        this.code = code;
        this.name = name;
        this.price = price;
        this.labor = labor;
    }
    
    static boolean check(String name, int price, int labor){
        if(name != null && name.length() != 0 && price > 0 && labor > 0){
            return true;
        }else{
            return false;
        }
    }
}

public class AliCarCar1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Car[] cars = new Car[N];
        int code = 0;
        for (int i = 0; i < N; ++i) {
            String name = scan.next();
            int price = scan.nextInt();
            int labor = scan.nextInt();
            if (cars[code].check(name,price,labor)) {
                cars[code] = new Car(code+1,name,price,labor);
                code++;
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }
        }

        for (int i = 0; i < code; i++)
            System.out.println((i+1) + " " + cars[i].name);
    }

*/