/*
import java.util.Scanner;

class Product {
    String name;
    int weight, price;
    
    public Product(String name, int weight, int price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    
    void printInfo(){
        System.out.println(weight+" grams of "+ name+ " costs "+ price+ " baht.");
    }
}

class PurchaseOrder {
    int n, price, weight;
    int[] amount;
    Product[] products;
    int sump = 0, sumw = 0;
    
    public PurchaseOrder(int n, Product[] products, int[] amount){
        this.n = n;
        this.products = products;
        this.amount = amount;
        for(int i=0;i<n;i++){
            sump += products[i].price * amount[i];
            sumw += products[i].weight * amount[i];
        }
    }
    
    void printInfo(){
        System.out.println(n+" items = "+sump+" baht "+sumw+" grams");
        for(int i=0;i<n;i++){
            int sum = amount[i] * products[i].price;
            System.out.println(products[i].name+" "+amount[i]+"x"+products[i].price+" = "+sum);
        }
    }
}

    public class ProductShipping2 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            Product[] products = new Product[n];
            int[] amount = new int[n];
            for (int i = 0; i < n; i++) {
                String name = in.next();
                int weight = in.nextInt();
                int price = in.nextInt();
                products[i] = new Product(name, weight, price);
                amount[i] = in.nextInt();
            }
            PurchaseOrder po = new PurchaseOrder(n, products, amount);
            po.printInfo();
        }
}
*/