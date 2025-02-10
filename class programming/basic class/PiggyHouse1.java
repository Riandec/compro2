import java.util.Scanner;

class House {
    public int width;
    public int length;
    public int amount;

    public House(int width, int length){
        this.width = width;
        this.length = length;
    }

    public void printPiggies(){
        System.out.println("Piggies "+amount+", Space "+(9*amount));
    }
    public static void encourage(){
        System.out.println("Piggy Together STRONG!");
    }
}

public class PiggyHouse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        House.encourage();
        int w = sc.nextInt();
        int l = sc.nextInt();
        House h = new House(w,l);
        while(true){
            int K = sc.nextInt();
            int area = w*l;
            int pigused = 9*(K+h.amount);
            if(area >= pigused){
                h.amount += K;
                h.printPiggies();
            }else{
                System.out.println("no space, need a new house");
                break;
            }
        }
    }
}
