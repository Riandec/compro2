import java.util.Scanner;

class Tumbol {
    String name;
    int latitude, longitude, population;
    int availBudget;

    public Tumbol(String name, int latitude, int longitude, int population){
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.population = population;
        availBudget = population*5000;
    }

    public void allocateBudget(int[] budget){
        boolean used = false;
        for(int i=0;i<budget.length;i++){
            if(budget[i] <= availBudget){
                used = true;
                System.out.print((i+1)+" ");
                availBudget -= budget[i];
            }
        }
        if(!used){
            System.out.print("none");
        }
    }
}

public class Tumbol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String district = sc.next();
        int latitude = sc.nextInt();
        int longitude = sc.nextInt();
        int population = sc.nextInt();
        int n = sc.nextInt();
        Tumbol t = new Tumbol(district, latitude, longitude, population);
        int[] budget = new int[n];
        for(int i=0;i<n;i++){
            budget[i] = sc.nextInt();
        }
        t.allocateBudget(budget);
    }
}
