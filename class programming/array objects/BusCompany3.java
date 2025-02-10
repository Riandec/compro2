
import java.util.Scanner;

class Bus {

    public String id;
    public int types;
    private int seats;
    private int taken = 0;
    private boolean status = true;

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
        if (status) {
            System.out.println("Active");
        } else {
            System.out.println("Inactive");
        }
    }
    
    boolean reserve(int k){
        if(k <= 0 || taken+k > seats || !status){
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

public class BusCompany3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Bus[] b = new Bus[q];
        for (int i = 0; i < q; i++) {
            String id = sc.next();
            int types = sc.nextInt();
            int seats = sc.nextInt();
            b[i] = new Bus(id, types, seats);
        }

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int k = sc.nextInt();
            int t = sc.nextInt();
            
            if(p == 1){
                boolean check = false;
                for(int j=0;j<q;j++){
                    if(b[j].types == t){
                        if(b[j].reserve(k)){
                            check = true;
                            System.out.println(b[j].id);
                            break;
                        }
                    }
                }
                if(!check){
                    System.out.println("sorry");
                }
            }else if(p == 2){
                b[t-1].sendToRepair();
            }else{
                b[t-1].backToService();
            }
        }
    }
}
