
import java.util.Scanner;

class Visitation {

    int id, date, hour, count = 0;
    int[] time;

    public Visitation(int id, int date) {
        this.id = id;
        this.date = date;
        time = new int[24];
    }

    void visit(int hour) {
        if (hour < 0 || hour > 23) {
            System.out.println("invalid hour: " + hour);
        } else {
            time[hour]++;
        }
    }

    int count() {
        for (int i = 0; i < time.length; i++) {
            count += time[i];
        }
        return count;
    }

    void printVisitHours(String name) {
        System.out.println(id);
        System.out.println(date);
        System.out.println(count());
        if(count() == 0){
            System.out.println("no visit");
        }else{
            for(int i=0;i<time.length;i++){
                if(time[i] > 0){
                    System.out.print(i +" ");
                }
            }
        }
    }
}

class Place{
    int idPlace;
    String namePlace;
    
    public Place(int idPlace, String namePlace){
        this.idPlace = idPlace;
        this.namePlace = namePlace;
    }
}

class Person{
    String name;
    Visitation[] visit;
    Place[] place;
    
    public Person(String name){
        this.name = name;
    }
    
    void addVisitation(Visitation[] visit){
        for(int i=0;i<visit.length;i++){
            if(visit[i].count() > 0){
                this.visit = visit;
            }
        }
    }
    
    void addPlace(Place[] place){
        this.place = place;
    }
    
    void printAllvisitations(String namePlace){
        for(int i=0;i<visit.length;i++){
            
        }
    }
}

public class Covid19Wins2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        Person[] person = new Person[p];
        for(int i=0;i<p;i++){
            int idPlace = scan.nextInt();
            String namePlace = scan.next();
            if(idPlace >= 1 && idPlace <= 300){
                person[i] = new Person(namePlace);
            }
        }
        String namePerson = scan.next();
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            int id = scan.nextInt();
            int date = scan.nextInt();
            int K = scan.nextInt();
            Visitation visit = new Visitation(id, date);
            for (int j = 0; j < K; j++) {
                int time = scan.nextInt();
                visit.visit(time);
            }
//            person[i].addVisitation(visit);
        }
    }
}
