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
    
    boolean reserve(int k){
        if(k < 0 || taken+k > seats || !status){
            return false;
        }else{
            taken += k;
            return true;
        }
    }
    
    void sendToRepair(){
        status = false;
    }
    
    void backToService(){
        status = true;
    }
}

public class BusCompany2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int types = sc.nextInt();
        int seats = sc.nextInt();
        Bus b = new Bus(id, types, seats);
        
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int p = sc.nextInt();
            int k = sc.nextInt();
            if(p == 1){
                b.reserve(k);
            }else if(p == 2){
                b.sendToRepair();
            }else if(p == 3){
                b.backToService();
            }
            b.printStats();
        }
    }
}
*/