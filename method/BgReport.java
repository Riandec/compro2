
import java.util.Scanner;

public class BgReport {

    static void reportBg(String name, int birth, int start) {
        if (name.length() >= 2) {
            System.out.println("Name: " + name);
        } else {
            System.out.println("Name: INVALID");
        }

        boolean birthtrue = birth >= 1900 && birth <= 2022;
        boolean starttrue = start >= 1900 && start <= 2022 && start - birth >= 18;
        if(birthtrue){
            System.out.println("Birth year: " +birth);
        }else{
            System.out.println("Birth year: INVALID");
        }
        
        if(birthtrue && starttrue){
            System.out.println("Start year: " +start);
        }else{
            System.out.println("Start year: INVALID");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int birth = sc.nextInt();
        int start = sc.nextInt();
        reportBg(name, birth, start);
    }
}
