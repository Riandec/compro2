
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

class Factory{
    int code, totallabor, currentlabor;
    boolean[] which;
    
    public Factory(int code, boolean[] which, int totallabor){
        this.code = code;
        this.which = which;
        this.totallabor = totallabor;
        currentlabor = 0;
    }
}

public class AliCarCar2 {

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
            }
        }
        boolean[] which = new boolean[N];
        Factory[] f = new Factory[5];
        for(int i = 0; i < 5; i++){
            int totallabor = scan.nextInt();
            for(int j = 0; j < N; j++){
                
            }
            f[i] = new Factory(code,which,totallabor);
        }
        
        
    }
}