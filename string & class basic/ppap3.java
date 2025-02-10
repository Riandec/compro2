
import java.util.Scanner;

public class ppap3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pp = "PPAP";
        String god = "GOD";
        int index = 0;
        for(int i = 0; i < text.length(); i++){
            int pp1 = text.indexOf(pp,index);
            int pp2 = text.indexOf(pp,pp1+1);
            int pp3 = text.indexOf(pp,pp2+1);
            int god1 = text.indexOf(god,index);
            
            if(god1 < pp2){
                index = pp2;
            }else if(god1 < pp3){
                index = pp3;
            }else{
                System.out.println(pp3+4);
                break;
            }
        }
    }
}
