import java.util.Scanner;

public class Pension {

    public static double calculatePension(int option, double lastSalary, double avgSalary, double calTime){
        double calMoney = 0;
        if (option == 0) {
            calMoney = lastSalary * calTime;
        } else if (option == 1) {
            double cond = avgSalary * 0.7;
            calMoney = (avgSalary * calTime) / 50;
            if (cond < calMoney) {
                calMoney = cond;
            }
            
        }
        return calMoney;
    }

    public static double calculateTime(int numYear, int numMonth, int numDay) {
        double calTime = 0;
        calTime = numYear + (numMonth/12.0) + (numDay/360.0);
        return calTime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        double lastSalary = sc.nextDouble(), avgSalary = sc.nextDouble();
        int numYear = sc.nextInt(), numMonth = sc.nextInt(), numDay = sc.nextInt();
        double totalYear = calculateTime(numYear, numMonth, numDay);
        String ans1 = String.format("Time: %.2f years", totalYear);
        System.out.println(ans1);

        double totalMoney = calculatePension(option, lastSalary, avgSalary, totalYear);
        String ans2 = String.format("Pension is %,.2f", totalMoney);
        System.out.print(ans2);
        if (option == 1) {
            System.out.print(" for each month.");
        }
        System.out.println();
    }
}