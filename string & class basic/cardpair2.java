
import java.util.Scanner;

public class cardpair2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int same1 = 0;
        int same2 = 0;
        for (int i = 0; i < 5; i++) {
            String pair = sc.nextLine();
            for (int j = 0; j < pair.length(); j++) {
                if ((int) pair.charAt(0) == (int) pair.charAt(1)) {
                    same1 = (int) pair.charAt(0);
                }else if((int)pair.charAt(0) < (int)pair.charAt(1)){
                    same1 = (int)pair.charAt(0);
                }else if((int)pair.charAt(1) < (int)pair.charAt(0)){
                    same1 = (int)pair.charAt(1);
                }
                if ((int) pair.charAt(3) == (int) pair.charAt(4)) {
                    same2 = (int) pair.charAt(3);
                }else if((int)pair.charAt(3) < (int)pair.charAt(4)){
                    same2 = (int)pair.charAt(3);
                }else if((int)pair.charAt(4) < (int)pair.charAt(3)){
                    same2 = (int)pair.charAt(4);
                }
            }
//            System.out.print(same1 + " " + same2);
//            System.out.println("");
        
            if ((int) pair.charAt(0) == (int) pair.charAt(1) && (int) pair.charAt(3) == (int) pair.charAt(4)) {
                if (same1 < same2) {
                    System.out.print("W");
                } else if (same1 > same2) {
                    System.out.print("L");
                } else if (same1 == same2) {
                    System.out.print("D");
                }
            }else if((int) pair.charAt(0) == (int) pair.charAt(1)){
                System.out.print("W");
            }else if((int) pair.charAt(3) == (int) pair.charAt(4)){
                System.out.print("L");
            }else if((int) pair.charAt(0) != (int) pair.charAt(1) && (int) pair.charAt(3) != (int) pair.charAt(4)){
                if (same1 < same2) {
                    System.out.print("W");
                } else if (same1 > same2) {
                    System.out.print("L");
                } else if (same1 == same2) {
                    System.out.print("D");
                }
            }
        }
    }
}
