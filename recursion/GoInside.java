
import java.util.Scanner;

public class GoInside {

    String goInside(String str, boolean front) {
        String s = "";
        
        if(str.length() <= 1){
            return str;
        }
        
        if(front == true){
            s = str.charAt(0) +""+ str.charAt(str.length()-1);
            return s + goInside(str.substring(1,str.length()-1),false);
        }else{
            s = str.charAt(str.length()-1) +""+ str.charAt(0);
            return s +""+ goInside(str.substring(1,str.length()-1),true);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        GoInside gi = new GoInside();
        String answer = gi.goInside(str, true);
        System.out.println(answer);
    }
}
