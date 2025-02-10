
import java.util.Scanner;

public class Account3 {
    int balance = 10000;
    int deposit(int money){
        if(money > 0){
            balance += money;
            return 0;
        }else{
            return -1;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        Account3 m = new Account3();
        int n = m.deposit(money);
        if(n == 0){
            System.out.println(m.balance);
        }else{
            System.out.println("Error");
        }
    }
}
