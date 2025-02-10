
import java.util.Scanner;

class Traveler{
    String passportID, before, date;
    double temp;
    int quarantine;
    String[] risk = {"JAPAN", "GERMANY", "KOREA", "CHINA", "TAIWAN", "FRANCE", "SINGAPORE", "ITALY", "IRAN"};
    
    public Traveler(String passportID, String before, String date, double temp){
        this.passportID = passportID;
        this.before = before;
        this.date = date;
        this.temp = temp;
        
        for(int i=0;i<risk.length;i++){
            if(risk[i].equals(before)){
                quarantine = -1;
            }
        }
        if(temp > 37.5){
            quarantine = -1;
        }
    }
    
    static int countq = 0, countnq = 0;
    void printInfo(Traveler[] tr){
        for(int i=0;i<tr.length;i++){
            if(tr[i].quarantine == -1){
                countq++;
            }else{
                countnq++;
            }
        }
        System.out.println(countq);
        for(int i=0;i<tr.length;i++){
            if(tr[i].quarantine == -1){
                System.out.println(tr[i].passportID +" "+ tr[i].date);
            }
        }
        System.out.println(countnq);
        for(int i=0;i<tr.length;i++){
            if(tr[i].quarantine == 0){
                System.out.println(tr[i].passportID +" "+ tr[i].date);
            }
        }
    }
}

public class TravelerScreening2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Traveler[] tr = new Traveler[n];
        for(int i=0;i<n;i++){
            String passportID = sc.next();
            String before = sc.next();
            String date = sc.next();
            double temp = sc.nextDouble();
            tr[i] = new Traveler(passportID,before,date,temp);
        }
        tr[0].printInfo(tr);
    }
}