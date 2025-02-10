
import java.util.Scanner;

public class Car2 {

    int year = 2001;
    int km = 8000;

    int calculatePrice() {
        int age = 2021 - year;
        int value = 10000 - km;
        return 25000 + value - (age * 1000);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car2 cr = new Car2();
        int cp = cr.calculatePrice();
        System.out.println(cp);
    }
}
