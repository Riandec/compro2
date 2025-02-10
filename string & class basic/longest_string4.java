import java.util.Scanner;

public class longest_string4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String maxstr = "";
        for(;;){
            String str = sc.nextLine();
            if(str.length() == 0){
                break;
            } 
            if(str.length() >= maxstr.length()){
                maxstr = str;
            }
        }
        System.out.println(maxstr);
    }
}
