import java.util.Scanner;

public class FinalCompro2 {

    static String split(String msg){
        boolean num = Character.isDigit(msg.charAt(0));
        if(msg.length() == 1){
            return msg.charAt(0) +"";
        }
        if(!num){
            return msg.charAt(0) + split(msg.substring(1));
        }else{
            return split(msg.substring(1)) + msg.charAt(0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        String res = split(msg);
        System.out.println(res);
    }
}