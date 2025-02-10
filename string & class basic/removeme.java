import java.util.Scanner;

public class removeme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int order = sc.nextInt();
            String word = sc.next();
            int first = str.indexOf(word);
            int last = str.lastIndexOf(word);
            if(order == 1){
                if(str.indexOf(word) != -1){
                    str = str.substring(0, first) + str.substring(first+word.length(),str.length());
                }
            }else if(order == 2){
                if(str.indexOf(word) != -1){
                    str = str.substring(0, last) + str.substring(last+word.length(),str.length());
                }
            }
            System.out.println(str);
        }
    }
}
