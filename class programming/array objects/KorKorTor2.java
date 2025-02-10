
import java.util.Scanner;

class Precinct{
    String station;
    String[] party;
    int[] point;
    
    public Precinct(String station, String[] party){
        this.station = station;
        this.party = party;
        point = new int[party.length];
    }
    
    void count(int num){
        if(num <= 0 || num > party.length){
            System.out.println("invalid number");
        }else{
            point[num-1]++;
            System.out.println(party[num-1] +" "+ point[num-1]);
        }
    }
    
    void printInfo(){
        for(int i=0;i<party.length;i++){
            System.out.println((i+1) +" "+ party[i] +" "+ point[i]);
        }
    }
    
    void printMax(){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<party.length;i++){
            if(point[i] >= max){
                max = point[i];
            }
        }
        for(int i=0;i<party.length;i++){
            if(point[i] == max){
                System.out.println((i+1) +" "+ party[i] +" "+ max);
            }
        }
    }
}

public class KorKorTor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String station = sc.next();
        int n = sc.nextInt();
        String[] party = new String[n];
        for(int i=0;i<n;i++){
            party[i] = sc.next();
        }
        int k = sc.nextInt();
        Precinct pr = new Precinct(station,party);
        for(int i=0;i<k;i++){
            int choice = sc.nextInt();
            if(choice == 1){
                int p = sc.nextInt();
                pr.count(p);
            }else if(choice == 2){
                pr.printInfo();
            }else if(choice == 3){
                pr.printMax();
            }
        }
    }
}
