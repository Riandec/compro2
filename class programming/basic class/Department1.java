
import java.util.Scanner;

class Dept{
    public int ministryBudget;
    public int eduFee;
    public int serviceFee;
    public int donation;
    
    public Dept(int n, int k){
        computeIncome(n,k);
    }
    
    public void computeIncome(int n, int k){
        ministryBudget = (n*500000)+(k*3000);
        eduFee = k*5000;
        serviceFee = 300000;
        donation = 100000;
    }
    
    public void printReport(){
        System.out.println("ministry budget = " +ministryBudget);
        System.out.println("education fee = " +eduFee);
        System.out.println("service fee = " +serviceFee);
        System.out.println("donation = " +donation);
    }
}

public class Department1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Dept d = new Dept(n,k);
        d.printReport();
    }
}
