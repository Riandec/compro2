
import java.util.Scanner;

public class CookiePlan {
    static int planCookie(int[] flour, int[] butter){
        int count = 0;
        for(int i=0;i<flour.length;i++){
            if(flour[i]/6 < 10 || butter[i]/3 < 10){
                System.out.println(i+1);
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] flour = new int[n];
        int[] butter = new int[n];
        for(int i=0;i<n;i++){
            flour[i] = sc.nextInt();
            butter[i] = sc.nextInt();
        }
        int day = planCookie(flour,butter);
        System.out.println("There are " +day+ " days that ingredients are insufficient");
    }
}
