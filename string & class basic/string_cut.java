
import java.util.Scanner;

public class string_cut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        int index = str.indexOf(c);
        int count = 0;
        boolean found = false;
        if(index == -1){
            System.out.println("no target character found");
            return;
        }
        while(index != -1){
            String output = str.substring(0, index);
            if(output.length() > 0){
                System.out.println(output);
                count++;
            }
            str = str.substring(index+1);
            index = str.indexOf(c);
        }
        System.out.print(str);
        if(count == 0){
            System.out.println("no output");
        }
    }
}
