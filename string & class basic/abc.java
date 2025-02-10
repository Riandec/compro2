
import java.util.Scanner;

public class abc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        for(int i=1;i<str.length()-1;i++){
            if((int)str.charAt(i) == (int)str.charAt(i-1)+1 && (int)str.charAt(i) == (int)str.charAt(i+1)-1){
                count++;
            }
        }
        System.out.println(count);
    }
}
