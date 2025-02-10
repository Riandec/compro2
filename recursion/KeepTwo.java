import java.util.Scanner;

public class KeepTwo {
    String keepTwo(String str){
        if(str.length() <= 2){
            return str;
        }
        String last = str.substring(str.length()-1, str.length());
        String str2 = str.substring(0, str.length()-1);
        int index1 = str2.indexOf(last);
        int index2 = str2.lastIndexOf(last);
        String ans = keepTwo(str2);
        if(index1 == index2){
            ans += last;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        KeepTwo kt = new KeepTwo();
        String answer = kt.keepTwo(str);
        System.out.println(answer);
    }
}
