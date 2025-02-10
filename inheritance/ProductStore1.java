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

public class ProductStore1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product[] p = new Product[n];
        for(int i=0;i<n;i++){
            sc.nextLine();
            String name = sc.nextLine();
            String sku = sc.nextLine();
            double price = sc.nextDouble();
            int weight = sc.nextInt();
            p[i] = new Product(name, sku, price, weight);
        }
        // call checkValidity of each product object
        for(int i=0;i<n;i++){
            boolean valid = p[i].checkValidity();
            System.out.println(valid);
        }
        // call printInfo of each product object
        for(int i=0;i<n;i++){
            p[i].printInfo();
        }
    }
}
