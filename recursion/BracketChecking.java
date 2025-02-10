
import java.util.Scanner;

public class BracketChecking {

    public static boolean CheckBracket(String s) {
        int open = s.indexOf("{");
        int close = s.indexOf("}");
        if(open == -1 && close == -1){
            return true;
        }else if((open >= 0 && close == -1) || (open == -1 && close >= 0)){
            return false;
        }
        String str = "";
        int lastopen = s.lastIndexOf("{");
        int lastclose = s.lastIndexOf("}");
        if(open < close){
            str = s.substring(open+1,lastclose) + s.substring(lastclose+1);
            return true && CheckBracket(str);
        }else{
            str = s.substring(close+1,lastopen) + s.substring(lastopen+1);
            return true && CheckBracket(str);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(CheckBracket(str));
    }
}
