
import java.util.Scanner;

class Station {
    int amountBenzin, amountDiesel;
    
    public Station(int amountBenzin, int amountDiesel){
        this.amountBenzin = amountBenzin;
        this.amountDiesel = amountDiesel;
    }
    
    void dispense(Car car){
        if(car.gasType == 1){
            if(amountBenzin > car.getNeededVol()){
                amountBenzin -= car.getNeededVol();
                System.out.println("Dispense "+car.getNeededVol()+" liters of benzin");
            }else{
                System.out.println("Dispense "+amountBenzin+" liters of benzin");
                amountBenzin -= amountBenzin; // amount = 0
            }
        }else if(car.gasType == 2){
            if(car.getNeededVol() <= amountDiesel){
                amountDiesel -= car.getNeededVol();
                System.out.println("Dispense "+car.getNeededVol()+" liters of diesel");
            }else{
                System.out.println("Dispense "+amountDiesel+" liters of diesel");
                amountDiesel -= amountDiesel;
            }
        }
    }
    
    void refillBenzin(int wantRefill){
        amountBenzin += wantRefill;
        System.out.println("Station has "+amountBenzin+" liters of benzin");
    }
    
    void refillDiesel(int wantRefill){
        amountDiesel += wantRefill;
        System.out.println("Station has "+amountDiesel+" liters of diesel");
    }
}

class Car {
    int gasType, gasCapacity,gasAmount;
    
    public Car(int gasType, int gasCapacity, int gasAmount){
        this.gasType = gasType;
        this.gasCapacity = gasCapacity;
        this.gasAmount = gasAmount;
    }
    
    int getNeededVol(){
        return gasCapacity - gasAmount;
    }
}

public class StationAndCar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int benzin = scan.nextInt();
        int diesel = scan.nextInt();
        Station sta = new Station(benzin,diesel);
 
        final int Q = scan.nextInt();
        for (int i = 0; i < Q; ++i) {
            final int A = scan.nextInt();
            final int B = scan.nextInt();
            final int C = scan.nextInt();
            final int D = scan.nextInt();
            if(A == 1){
                Car car = new Car(B,C,D);
                sta.dispense(car);
            }else if(A == 2){
                if(B == 1){
                    sta.refillBenzin(C);
                }else if(B == 2){
                    sta.refillDiesel(C);
                }
            }
        }
    }
}
