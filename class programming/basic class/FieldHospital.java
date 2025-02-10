
import java.util.Scanner;

class FieldManager{
    public int bedAmount;
    public boolean[] reserve;
    public int number;
    
    public FieldManager(int bedAmount){
        this.bedAmount = bedAmount;
        reserve = new boolean[bedAmount];
    }
     
    int reserveBed(){
        for(int i=0;i<bedAmount;i++){
            if(!reserve[i]){
               reserve[i] = true;
               return i;
            }
        }
        return -1;
    }
    
    boolean discharge(int number){
        if(reserve[number-1]){
            reserve[number-1] = false;
            System.out.println("Patient discharged");
            return true;
        }else{
            System.out.println("Invalid bed number");
            return false;
        }
    }
    
    void reportBed(){
        int count = 0;
        for(int i=0;i<bedAmount;i++){
            if(reserve[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}

public class FieldHospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FieldManager fm = new FieldManager(n);
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int option = sc.nextInt();
            int a = sc.nextInt();
            if(option == 1){
                int result = fm.reserveBed();
                if(result == -1){
                    System.out.println("No bed vacancy");
                }else{
                    System.out.println("Bed " +(result+1)+ " reserved");
                }
            }else if(option == 2){
                fm.discharge(a);
            }else if(option == 3){
                fm.reportBed();
            }
        }
    }
}
