
import java.util.Scanner;

public class count_between2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int count1=0; int count2=0; int count3=0;
        for(int i=0;i<text.length();i++){
            boolean up = Character.isUpperCase(text.charAt(i));
            boolean low = Character.isLowerCase(text.charAt(i));
            if(low){
                count1++;
            }else if(up){
                count2++;
            }else{
                count3++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
    }
}
