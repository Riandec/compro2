
import java.util.Scanner;

public class Account2 {
    int balance = 10000;
    void deposit(int money){
        balance += money;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        Account2 m = new Account2();
        m.deposit(money);
        System.out.println(m.balance);
    }
}
