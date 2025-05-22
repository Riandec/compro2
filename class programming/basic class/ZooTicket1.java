import java.util.Scanner;

class ZooTicket{
    String name;
    boolean ride,seal,tiger;
    int price = 100;
    
    public ZooTicket(String name){
        this.name = name;
    }
    
    void bookRide(){
        ride = true;
        price += 40;
    }    
    void bookSealShow(){
        seal = true;
        price += 50;
    }
    void bookTigerShow(){
        tiger = true;
        price += 65;
    }
    
    void summarize(){
        System.out.println(name);
        if(ride){
            System.out.println("Ride");
        }
        if(seal){
            System.out.println("Seal");
        }
        if(tiger){
            System.out.println("Tiger");
        }
        System.out.println(price);
    }
}

public class ZooTicket1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        ZooTicket ticket = new ZooTicket(name);
        
        for(;;){
            int service = sc.nextInt();
            if(service == 0){
                break;
            }else if(service == 1){
                ticket.bookRide();
            }else if(service == 2){
                ticket.bookSealShow();
            }else if(service == 3){
                ticket.bookTigerShow();
            }
        }
        ticket.summarize();
    }
}
