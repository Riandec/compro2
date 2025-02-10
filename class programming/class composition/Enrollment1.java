/*
import java.util.Scanner;

class Course {
    String name;
    int full, count;
    int[] id;
    
    public Course(String name, int full){
        this.name = name;
        this.full = full;
        id = new int[full];
        count = 0;
    }
    
    boolean enroll(int num){
        for(int i=0;i<id.length;i++){
            if(id[i] == num){
                return false;
            }
        }
        if(count == full){
            return false;
        }else{
            id[count] = num;
            count++;
            return true;
        }
    }
    
    void printInfo(){
        System.out.println(name +" "+ count);
        for(int i=0;i<count;i++){
            System.out.println(id[i]);
        }
    }
}

public class Enrollment1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        final int N = scan.nextInt();
        final int K = scan.nextInt();

        Course co = new Course(str, N);
        for (int i = 0; i < K; ++i) {
            int id = scan.nextInt();
            boolean result = co.enroll(id);
            System.out.println(result);
        }

        co.printInfo();
    }
}
*/