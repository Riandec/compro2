import java.util.Scanner;

public class RemoveAnyDup {
    String removeAnyDup(String str){
        if(str.length() == 0){
            return "";
        }
        String last = str.substring(str.length()-1, str.length());
        String str2 = str.substring(0, str.length()-1);
        int index = str2.indexOf(last);
        String ans = removeAnyDup(str2);
        if(index == -1){
            ans += last;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        RemoveAnyDup remover = new RemoveAnyDup();
        String result = remover.removeAnyDup(str);
        System.out.println(result);
    }
}
