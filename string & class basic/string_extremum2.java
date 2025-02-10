
import java.util.Scanner;

public class string_extremum2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String interest1 = sc.next();
        String interest2 = sc.next();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String last = " ";
        sc.nextLine();
        if(num == 1){
            for(;;){
                String text = sc.nextLine();
                if(text.length() == 0){
                    break;
                }
                if(text.indexOf(interest1) >= 0 || text.indexOf(interest2) >= 0){
//                    System.out.println(text);
                    if(text.length() >= max){
                        max = text.length();
                        last = text;
                    }
                }
            }
            System.out.println(max);
            System.out.println(last);
        }else if(num == 2){
            for(;;){
                String text = sc.nextLine();
                if(text.length() == 0){
                    break;
                }
                if(text.indexOf(interest1) >= 0 || text.indexOf(interest2) >= 0){
//                    System.out.println(text);
                    if(text.length() <= min){
                        min = text.length();
                        last = text;
                    }
                }
            }
            System.out.println(min);
            System.out.println(last);
        }
    }
}
