/*
import java.util.Scanner;

class Traveler{
    String passportID, before, date;
    double tempo;
    int quarantine;
    String[] risk = {"JAPAN", "GERMANY", "KOREA", "CHINA", "TAIWAN", "FRANCE", "SINGAPORE", "ITALY", "IRAN"};
    
    public Traveler(String passportID, String before, String date, double tempo){
        this.passportID = passportID;
        this.before = before;
        this.date = date;
        this.tempo = tempo;
        
        for(int i=0;i<risk.length;i++){
            if(risk[i].equals(before)){
                quarantine = -1;
            }
        }
        if(tempo > 37.5){
            quarantine = -1;
        }
    }
    
    void printInfo(){
        if(quarantine == -1){
            System.out.println(passportID +" STATE-QUARANTINE");
        }else{
            System.out.println(passportID+" SELF-QUARANTINE");
        }
    }
}

public class TravelerScreening1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Traveler[] tr = new Traveler[n];
        for(int i=0;i<n;i++){
            String passportID = sc.next();
            String before = sc.next();
            String date = sc.next();
            double tempo = sc.nextDouble();
            tr[i] = new Traveler(passportID,before,date,tempo);
            tr[i].printInfo();
        }
    }
}
*/