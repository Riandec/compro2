
import java.util.Scanner;

class LectRoom{
    public int classCode;
    public String name;
    public int capacity;
    public int currentSeats;
    
    public LectRoom(int classCode, String name, int capacity){
     this.classCode = classCode;
     this.name = name;
     this.capacity = capacity;
    }
    
    boolean reserveSeats(int amount){
        if(currentSeats + amount <= capacity){
            currentSeats += amount;
            return true;
        }else{
            return false;
        }
    }
}

public class LectureRoom1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        LectRoom[] lec = new LectRoom[k];
        for(int i=0;i<k;i++){
            int code = sc.nextInt();
            String name = sc.next();
            int cap = sc.nextInt();
            lec[i] = new LectRoom(code,name,cap);
        }
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int ccode = sc.nextInt();
            int seat = sc.nextInt();
            boolean is = false;
            for(int j=0;j<k;j++){
                if(ccode == lec[j].classCode){
                    boolean check = lec[j].reserveSeats(seat);
                    if(check){
                        System.out.println(lec[j].name);
                        is = true;
                        break;
                    }
                }
            }
            if(!is){
                System.out.println("sorry");
            }
        }
    }
}
