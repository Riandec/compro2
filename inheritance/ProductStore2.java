import java.util.Scanner;

class Product {
    String name, sku;
    double price;
    int weight;
    boolean valid;

    public Product(String name, String sku, double price, int weight){
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.weight = weight;
    }

    public boolean checkValidity(){
        boolean check = true;
        if(name == null || name.length() == 0){
            System.out.println("name is invalid");
            check = false;
        }
        if(sku == null || sku.length() == 0){
            System.out.println("sku is invalid");
            check = false;
        }
        if(price < 0){
            System.out.println("price is invalid");
            check = false;
        }
        if(weight < 0){
            System.out.println("weight is invalid");
            check = false;
        }
        valid = check;
        return valid;
    }
    public void printInfo(){
        System.out.print(name+", "+sku+", "+price+", "+weight);
        if(valid){
            System.out.println("");
        }else{
            System.out.println(", Invalid");
        }
    }
}

// subclass
class Shoe extends Product {
    int gender, size, type;
    String brand;
    Product products;

    public Shoe(String name, String sku, double price, int weight, int gender, int size, int type, String brand){
        super(name, sku, price, weight);
        this.gender = gender;
        this.size = size;
        this.type = type;
        this.brand = brand;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        if(gender == 1){
            System.out.print("female, ");
        }else{
            System.out.print("male, ");
        }
        System.out.print(size+", ");
        if(type == 1){
            System.out.print("sport, ");
        }else if(type == 2){
            System.out.print("formal, ");
        }else if(type == 3){
            System.out.print("casual, ");
        }
        System.out.println(brand);
    }
}

public class ProductStore2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Shoe[] sh = new Shoe[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            String name = sc.nextLine();
            String sku = sc.nextLine();
            double price = sc.nextDouble();
            int weight = sc.nextInt();
            int gender = sc.nextInt();
            int size = sc.nextInt();
            int type = sc.nextInt();
            String brand = sc.next();
            sh[i] = new Shoe(name, sku, price, weight, gender, size, type, brand);
        }
        // call checkValidity of each product object
        for(int i=0;i<n;i++){
            boolean valid = sh[i].checkValidity();
            System.out.println(valid);
        }
        // call printInfo of each product object
        for(int i=0;i<n;i++){
            sh[i].printInfo();
        }
    }
}
