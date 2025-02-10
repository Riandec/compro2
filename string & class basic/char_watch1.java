
import java.util.Scanner;

public class char_watch1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String text = sc.next();
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        
        char c1 = s1.charAt(0);
        char c2 = s2.charAt(0);
        char c3 = s3.charAt(0);
        int count1 = 0; int count2 = 0; int count3 = 0; int count4 = 0;
        for(int i=0;i<text.length();i++){
            char keep = text.charAt(i);
            if(keep == c1){
                for(int j=0;j<n;j++){
                    if(a[j] == (i+1)){
                        count1++;
                    }
                }
            }
            if(keep == c2){
                for(int j=0;j<n;j++){
                    if(a[j] == (i+1)){
                        count2++;
                    }
                }
            }
            if(keep == c3){
                for(int j=0;j<n;j++){
                    if(a[j] == (i+1)){
                        count3++;
                    }
                }
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        
        for(int i=0;i<n;i++){
            if(a[i] <= 0 || a[i] > text.length()){
                count4++;
            }
        }
        System.out.println(count4);
    }
}
