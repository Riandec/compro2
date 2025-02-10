
import java.util.Scanner;

class ZooTicketA{
    boolean type, child, adult;
    boolean used = false;
    int height;
    
    public ZooTicketA(boolean type){
        this.type = type;
        if(type){
            child = type;
        }else if(!type){
            adult = type;
        }
    }
    
    boolean enterZoo(int height){
        if(child){
            if(used || height > 120){
                return false;
            }else{
                used = true;
                return true;
            }
        }else{
            if(used){
                return false;
            }else{
                used = true;
                return true;
            }
        }
    }
}

public class ZooTicketAgain1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ZooTicketA[] tickets = new ZooTicketA[n];
        for(int i=0;i<n;i++){
            int type = sc.nextInt();
            if(type == 1){
                tickets[i] = new ZooTicketA(false);
            }else{
                tickets[i] = new ZooTicketA(true);
            }
        }
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int id = sc.nextInt();
            int height = sc.nextInt();
            System.out.println(tickets[id-1].enterZoo(height));
        }
    }
}
