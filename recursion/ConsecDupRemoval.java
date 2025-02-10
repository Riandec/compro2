
import java.util.Scanner;

public class ConsecDupRemoval {

    String dupRemove(String str) {
        int length = str.length();
        if(str.length() == 1){
            return str;
        }
        
        if(str.charAt(0) == str.charAt(1)){
            return dupRemove(str.substring(1));
        }else{
            return str.charAt(0) + dupRemove(str.substring(1));
        }
//        return "";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = (new ConsecDupRemoval()).dupRemove(str);
        System.out.print(result);
    }
}
