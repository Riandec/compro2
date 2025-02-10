/*
import java.util.Scanner;

class Bus {

    public String id;
    public int types;
    public int seats;
    public int taken = 0;
    public boolean status = true;

    public Bus(String id, int types, int seats) {
        this.id = id;
        this.types = types;
        this.seats = seats;
    }

    public void printStats() {
        System.out.println(id);
        if (types == 1) {
            System.out.println("Fan");
        } else if (types == 2) {
            System.out.println("P1");
        } else if (types == 3) {
            System.out.println("VIP");
        }
        System.out.println(taken + " " + seats);
        if(status){
            System.out.println("Active");
        }else{
            System.out.println("Inactive");
        }
    }
}

public class BusCompany1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int types = sc.nextInt();
        int seats = sc.nextInt();
        Bus b = new Bus(id, types, seats);
        b.printStats();
    }
}
*/