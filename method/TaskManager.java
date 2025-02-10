
import java.util.Scanner;

public class TaskManager {
    static void reportLoad(int power, int ram, int pused, int rused) {
        int per_cpu = (pused*100) / power;
        int per_ram = (rused*100) / ram;
        System.out.println("CPU: " +pused+ "/" +power+ " (" +per_cpu+ "%)" );
        System.out.println("RAM: " +rused+ "/" +ram+ " (" +per_ram+ "%)");
        if(per_cpu >= 80){
            System.out.println("Limited CPU power");
        }
        if(per_ram >= 80){
            System.out.
                    println("Limited RAM availability");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int power = sc.nextInt();
        int ram = sc.nextInt();
        int pused = sc.nextInt();
        int rused = sc.nextInt();
        reportLoad(power,ram,pused,rused);
    }
}
