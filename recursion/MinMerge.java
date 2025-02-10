
import java.util.Scanner;

public class MinMerge {
    String merge(String str1, String str2){
        if(str1.length() == 0){
            return str2.substring(0);
        }else if(str2.length() == 0){
            return str1.substring(0);
        }
        
        if((int)str1.charAt(0) < (int)str2.charAt(0)){
            return str1.charAt(0) + merge(str1.substring(1),str2.substring(1));
        }else if((int)str1.charAt(0) == (int)str2.charAt(0)){
            return str1.charAt(0) + merge(str1.substring(1),str2.substring(1));
        }else{
            return str2.charAt(0) + merge(str1.substring(1),str2.substring(1));
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        MinMerge merger = new MinMerge();
        System.out.println(merger.merge(str1,str2));
    }
}
/* NARUTO
OROCHIMARU
*/
