
import java.util.Scanner;

public class BaseConverter {

    String convertBase(int decimal, int base) {
        int frac = decimal%base;
        int divide = decimal/base;
        if(divide == 0){
            return frac+"";
        }else{
            return convertBase(divide,base) + frac;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BaseConverter bc = new BaseConverter();
        int decimal = sc.nextInt();
        int base = sc.nextInt();
        String result = bc.convertBase(decimal, base);
        System.out.println(result);
    }
}
