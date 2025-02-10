import java.util.Scanner;

public class index_of_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.next();
        int index = text1.indexOf(text2);
        if(index == -1){
            System.out.println("string not found");
        } else {
            while(index != -1){
                System.out.print(index+1 +" ");
                index = text1.indexOf(text2, index+1);
            }
        }
    }
}
