/*
import java.util.Scanner;

class Route{
    public String[] name;
    public int[] distances;
    
    public Route(String[] name, int[] distances){
        this.name = name;
        this.distances = distances;
    }
    
    public void getStopInfo(int num){
        if(num>=1 && num<name.length){
            System.out.println(name[num] +" "+ distances[num]);
        }else{
            System.out.println("invalid number");
        }
    }
    
    public void summarizeRoute(){
        int sum = 0;
        for(int i=0;i<name.length;i++){
            sum += distances[i];
        }
        System.out.println(name[1] +" "+name[name.length-1] +" "+ sum);
    }
}

public class BusRoute2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n+1];
        int[] distances = new int[n+1];
        for(int i=1;i<=n;i++){
            name[i] = sc.next();
            distances[i] = sc.nextInt();
        }
        Route r = new Route(name,distances);
        r.summarizeRoute();
    }
}*/
