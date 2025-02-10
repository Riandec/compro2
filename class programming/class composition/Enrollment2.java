
import java.util.Scanner;

class Student{
    int id;
    String firstName, lastName;
    
    public Student(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    void printInfo(){
        System.out.println(id +" "+ firstName +" "+ lastName);
    }
}

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
    
    boolean enroll(int num, Student[] student){
        for(int i=0;i<id.length;i++){
            if(id[i] == num){
                return false;
            }
        }
        
        int index = 0;
        boolean checkid = false;
        for(int i=0;i<student.length;i++){
            if(num == student[i].id){
                checkid = true;
                index = i;
                break;
            }
        }
        
        if(!checkid){
            System.out.print("Invalid ID ");
            return false;
        }
        
        if(count == full){
            return false;
        }else{
            id[count] = num;
            System.out.print(student[index].firstName +" "+ student[index].lastName +" ");
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

public class Enrollment2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int P = scan.nextInt();
        Student[] s = new Student[P];
        for(int i = 0;i < P; ++i){
            int id = scan.nextInt();
            String firstName = scan.next();
            String lastName = scan.next();
            s[i] = new Student(id,firstName,lastName);
        }
        
        String str = scan.next();
        final int N = scan.nextInt();
        final int K = scan.nextInt();

        Course co = new Course(str, N);
        for (int i = 0; i < K; ++i) {
            int id = scan.nextInt();
            boolean result = co.enroll(id,s);
            System.out.println(result);
        }
        co.printInfo();
    }
}