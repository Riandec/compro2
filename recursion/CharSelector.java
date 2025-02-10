
import java.util.Scanner;

public class CharSelector {

    String selectChar(String s, int[] k) {
        if(s.length() == 0){
            return "";
        }else{
            int change = k[s.length()-1];
            return s.charAt((s.length()-1)-change) +"";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        final int N = s.length();
        int[] k = new int[N];

        for (int i = 0; i < N; ++i) {
            k[i] = scan.nextInt();
        }

        CharSelector selector = new CharSelector();
        String ans = selector.selectChar(s, k);
        System.out.println(ans);
    }
}
