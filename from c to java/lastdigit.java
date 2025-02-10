import java.util.Scanner;

public class lastdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(number%10);
    }
}
