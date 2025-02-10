
import java.util.Scanner;

class Party{
    String partyName;
    int partyPopu;
    String[] name;
    String[] surname;
    int[] regionNumber;
    
    public Party(String partyName, int partyPopu, Scanner sc){
        this.partyName = partyName;
        this.partyPopu = partyPopu;
        name = new String[partyPopu];
        surname = new String[partyPopu];
        regionNumber = new int[partyPopu];
        for(int i=0;i<partyPopu;i++){
            name[i] = sc.next();
            surname[i] = sc.next();
            regionNumber[i] = sc.nextInt();
        }
    }
    
    void printInfo(int num){
        if(num < 0){
            System.out.println("invalid region number");
        }else if(num == 0){
            for(int i=0;i<partyPopu;i++){
                System.out.println(name[i] +" "+ surname[i] +" "+ regionNumber[i]);
            }
        }else{
            boolean have = false;
            for(int i=0;i<partyPopu;i++){
                if(num == regionNumber[i]){
                    System.out.println(name[i] +" "+ surname[i]);
                    have = true;
                }
            }
            if(!have){
                System.out.println("none");
            }
        }
    }
}

public class KorKorTor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] partyName = new String[n];
        int[] partyPopu = new int[n];
        Party[] p = new Party[n];
        for(int i=0;i<n;i++){
            partyName[i] = sc.next();
            partyPopu[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            p[i] = new Party(partyName[i], partyPopu[i], sc);
        }
        int k = sc.nextInt();
        for(int i=0;i<k;i++){
            int partyNumber = sc.nextInt();
            int regionNumber = sc.nextInt();
            p[partyNumber-1].printInfo(regionNumber);
        }
    }
}
