/*
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

    void printVisitHours() {
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

public class Covid19Wins1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        int date = scan.nextInt();
        final int K = scan.nextInt();
        Visitation visit = new Visitation(id, date);
        for (int i = 0; i < K; i++) {
            int time = scan.nextInt();
            visit.visit(time);
        }
        visit.printVisitHours();
    }
}
*/