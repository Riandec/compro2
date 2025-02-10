
import java.util.Scanner;

class WaterTank {
    int capacity;
    int volume = 0;
    int fill(int amount){
        if(amount + volume > capacity){
            System.out.println("Cannot fill the tank");
            return -1;
        }else{
            volume += amount;
            return volume;
        }
    }
}

public class TankObserver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int length = sc.nextInt();
        int height = sc.nextInt();
        WaterTank tank = new WaterTank();
        tank.capacity = width * length * height;
        for(int i=0;i<5;i++){
            int amount = sc.nextInt();
            System.out.println(tank.fill(amount));
        }
    }
}
