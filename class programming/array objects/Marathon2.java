
import java.util.Scanner;

class Runner{
    public String name;
    public String bib;
    public static int amount = 0;
    public int type;
    boolean inrange;
    
    public Runner(String name, int type){
        this.name = name;
        this.type = type;
        inrange = type > 0 && type <= 4;
        if(inrange){
            amount++;
        }
        if(type == 1){
            bib = "A";
        }else if(type == 2){
            bib = "B";
        }else if(type == 3){
            bib = "C";
        }else if(type == 4){
            bib = "D";
        }
    }
    
    void printInfo(){
        if(!inrange){
            System.out.println("INVALID");
        }else{
            if(amount < 10){
                System.out.println(bib+"00"+amount +" ");
            }else if(amount >= 10){
                System.out.println(bib+"0"+amount +" ");
            }
        }
    }
}

public class Marathon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Runner[] r = new Runner[n];
        for(int i=0;i<n;i++){
            String name = sc.next();
            int type = sc.nextInt();
            r[i] = new Runner(name,type);
//            r[i].printInfo();
        }
    }
}
