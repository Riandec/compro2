
import java.util.Scanner;

public class Account1 {
    int balance = 10000;
    int deposit(int money){
        return balance + money;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        Account1 m = new Account1();
        int n = m.deposit(money);
        System.out.println(n);
    }
}
