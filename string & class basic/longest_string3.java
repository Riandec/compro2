import java.util.Scanner;

public class longest_string3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String maxstr = "";
        for(int i=0;i<5;i++){
            String str = sc.nextLine();
            if(str.length() >= max){
                max = str.length();
                maxstr = str;
            }
        }
        System.out.println(maxstr);
    }
}
