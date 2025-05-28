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

    public int allocateBudget(int[] budget){
        boolean used = false;
        int total = 0;
        for(int i=0;i<budget.length;i++){
            if(budget[i] <= availBudget){
                used = true;
                System.out.print((i+1)+" ");
                availBudget -= budget[i];
                total += budget[i];
            }
        }
        if(!used){
            System.out.println("none");
        }else{
            System.out.println("");
        }
        return total;
    }
}

public class Tumbol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Tumbol[] t = new Tumbol[k];
        for(int i=0;i<k;i++){
            String district = sc.next();
            int latitude = sc.nextInt();
            int longitude = sc.nextInt();
            int population = sc.nextInt();
            t[i] = new Tumbol(district, latitude, longitude, population);
        }
        int total = 0;
        for(int i=0;i<k;i++){
            int n = sc.nextInt();
            int[] budget = new int[n];
            for(int j=0;j<n;j++){
                budget[j] = sc.nextInt();
            }
            total += t[i].allocateBudget(budget);
        }
        System.out.println(total);
    }
}
