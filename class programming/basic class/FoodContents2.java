
import java.util.Scanner;

class Food{
    public String name;
    public String ingredient;
    public int weight;
    public int calorie;
    
    public Food(String name, String ingredient, int weight, int calorie){
        this.name = name;
        this.ingredient = ingredient +" ";
        this.weight = weight;
        this.calorie = calorie * weight;
    }
    
    void addContent(String ingredient, int weight, int calorie){
        this.weight += weight;
        this.calorie += calorie * weight;
        this.ingredient += ingredient +" ";
    }
    
    void printInfo(){
        System.out.println(name);
        System.out.println(weight +" "+ calorie);
        System.out.print(ingredient);
    }
}

public class FoodContents2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String ingredient = sc.next();
        int weight = sc.nextInt();
        int calorie = sc.nextInt();
        Food f = new Food(name,ingredient,weight,calorie);
        int option = sc.nextInt();
        while(option != 0){
            if(option == 1){
                f.printInfo();
                System.out.println();
            }else if(option == 2){
                String new_ingredient = sc.next();
                int new_weight = sc.nextInt();
                int new_calorie = sc.nextInt();
                f.addContent(new_ingredient, new_weight,new_calorie);
            }
            option = sc.nextInt();
        }
    }
}
