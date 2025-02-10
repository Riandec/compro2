
import java.util.Scanner;

public class cardpair1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int more1 = 0; int more2 = 0;
        for (int i = 0; i < 5; i++) {
            String pair = sc.nextLine();
            for (int j = 0; j < pair.length(); j++) {
//                System.out.print((int)pair.charAt(j) +" ");
                if((int)pair.charAt(0) <= (int)pair.charAt(1)){
                    more1 = (int)pair.charAt(0);
                }else if((int)pair.charAt(1) <= (int)pair.charAt(0)){
                    more1 = (int)pair.charAt(1);
                }
                
                if((int)pair.charAt(3) <= (int)pair.charAt(4)){
                    more2 = (int)pair.charAt(3);
                }else if((int)pair.charAt(4) <= (int)pair.charAt(3)){
                    more2 = (int)pair.charAt(4);
                }
            }
//            System.out.print(more1 +" "+ more2);
//            System.out.println("");
            if(more1 < more2){
                System.out.print("W");
            }else if(more1 > more2){
                System.out.print("L");
            }else if(more1 == more2){
                System.out.print("D");
            }
        }
    }
}
