import java.util.Scanner;

public class UnderLine1 {
    static void underline(){
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i=0;i<number;i++){
            String name = sc.next();
            System.out.println(name);
            underline();
        }
    }    
}

