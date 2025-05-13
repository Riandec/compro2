
import java.util.Scanner;

class Food{
    public String name;
    public String ingredient;
    public int weight;
    
    public Food(String name, String ingredient, int weight){
        this.name = name;
        this.ingredient = ingredient +" ";
        this.weight = weight;
    }
    
    void addContent(String ingredient, int weight){
        this.weight += weight;
        this.ingredient += ingredient +" ";
    }
    
    void printInfo(){
        System.out.println(name);
        System.out.println(weight);
        System.out.println(ingredient);
    }
}

public class FoodContents1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String ingredient = sc.next();
        int weight = sc.nextInt();
        Food f = new Food(name,ingredient,weight);
        int option = sc.nextInt();
        while(option != 0){
            if(option == 1){
                f.printInfo();
            }else if(option == 2){
                String new_ingredient = sc.next();
                int new_weight = sc.nextInt();
                f.addContent(new_ingredient, new_weight);
            }
            option = sc.nextInt();
        }
    }
}
