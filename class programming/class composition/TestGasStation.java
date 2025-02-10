
import java.util.Scanner;

class Truck {
    int weight, amount;
    
    public Truck(int weight, int amount){
        this.weight = weight;
        this.amount = amount;
    }
    
     double calFuel(int distance){
        double result = (distance + weight) / 10.0;
        return (double)Math.ceil(result);
    }
}

class GasStation{
    double[] amount;
    
    public GasStation(double[] amount){
        this.amount = amount;
    }
    
    void fillTank(int type, Truck truck, int distance){
        if(truck.calFuel(distance) <= amount[type-1]){
            amount[type-1] -= truck.calFuel(distance);
        }else{
            System.out.println(type +" out of gasoline");
        }
    }
    
    void refuel(double[] allamount){
        for(int i=0;i<allamount.length;i++){
            amount[i] += allamount[i];
        }
    }
    
    void print(){
        for(int i=0;i<amount.length;i++){
            System.out.print(amount[i] +" ");
        }
        System.out.println("");
    }
}

public class TestGasStation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Truck[] t = new Truck[n];
        for (int i = 0; i < n; i++) {
            t[i] = new Truck(in.nextInt(), in.nextInt());
        }
        int k = in.nextInt();
        double[] amount = new double[k];
        for(int i = 0; i < k; i++){
            amount[i] = in.nextDouble();
        }
        GasStation gas = new GasStation(amount);
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int order  = in.nextInt();
            if(order == 0){
                int num = in.nextInt();
                int type = in.nextInt();
                int distance = in.nextInt();
                gas.fillTank(type, t[num-1], distance);
            }else if(order == 1){
                double[] have = new double[k];
                for(int j=0;j<k;j++){
                    have[j] = in.nextDouble();
                }
                gas.refuel(have);
            }
            gas.print();
        }
    }
}
