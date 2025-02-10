import java.util.Scanner;

public class cutandhide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ch = sc.next();
        int first = str.indexOf(ch);
        int last = str.lastIndexOf(ch);
        System.out.print(ch);
        for(int i=first;i<=last;i++){
            // System.out.print(str.charAt(i));
            if(str.charAt(i) != ch.charAt(0)){
                System.out.print(str.charAt(i));
            }
        }
        System.out.print(ch);
    }
}
