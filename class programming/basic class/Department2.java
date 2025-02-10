
import java.util.Scanner;

class Dept{
    public int ministryBudget;
    public int eduFee;
    public int serviceFee;
    public int donation;
    public int salary;
    public int elec;
    public int eduCost;
    public int totalIncome;
    public int totalExpense;
    
    public Dept(int n, int k){
        totalIncome = computeIncome(n,k);
        totalExpense = computeExpense(n,k);
        System.out.println("total income = " +totalIncome);
        System.out.println("total expense = " +totalExpense);
        System.out.println("income - expense = " +(totalIncome - totalExpense));
    }
    
    public int computeIncome(int n, int k){
        ministryBudget = (n*500000)+(k*3000);
        eduFee = k*5000;
        serviceFee = 300000;
        donation = 100000;
        return ministryBudget + eduFee + serviceFee + donation;
    }
    
    public int computeExpense(int n, int k){
        salary = n * 600000;
        elec = (n+k) * 2000;
        eduCost = k * 4000;
        return salary + elec + eduCost;
    }
    
    public void printReport(){
        System.out.println("ministry budget = " +ministryBudget);
        System.out.println("education fee = " +eduFee);
        System.out.println("service fee = " +serviceFee);
        System.out.println("donation = " +donation);
        System.out.println("salary = " +salary);
        System.out.println("electricity = " +elec);
        System.out.println("educational cost = " +eduCost);
    }
}

public class Department2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Dept d = new Dept(n,k);
        d.printReport();
    }
}
