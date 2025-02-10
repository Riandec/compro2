import java.util.Scanner;

public class insideout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int half = str.length()/2;
        if(str.length()%2 == 0){
            for(int i=0;i<half;i++){
                System.out.print(str.charAt(half-i-1));
                System.out.print(str.charAt(half+i));
            }
        }else{
            System.out.print(str.charAt(half));
            for(int i=1;i<=half;i++){
                System.out.print(str.charAt(half-i));
                System.out.print(str.charAt(half+i));
            }
        }
    }
}
