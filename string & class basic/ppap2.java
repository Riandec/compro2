
import java.util.Scanner;

public class ppap2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pp = "PPAP";
        String god = "GOD";
        int index = 0;
        for(int i =  0; i < text.length(); i++){
            int pp1 = text.indexOf(pp,index);
            int pp2 = text.indexOf(pp,pp1+1);
            int god1 = text.indexOf(god,index);
            
            if(god1 < pp2){
                index = pp2;
            }else{
                System.out.println(pp2+4);
                break;
            }
        }
    }
}