import java.util.Scanner;

public class oddvseven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd = 0, even = 0;
        for(int i=0; i<8; i++){
            int number = sc.nextInt();
            if (number%2 == 0){
                even += number;
            } else {
                odd += number;
            }
        }

        if (even > odd){
            System.out.println("even");
        } else if (odd > even){
            System.out.println("odd");
        } else {
            System.out.println("equal");
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
