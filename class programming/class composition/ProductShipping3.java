
import java.util.Scanner;


class Product {

    String name;
    int weight, price;

    public Product(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    void printInfo() {
        System.out.println(weight + " grams of " + name + " costs " + price + " baht.");
    }
}

class PurchaseOrder {

    int n, price, weight;
    int[] amount;
    Product[] products;
    int sump = 0, sumw = 0;

    public PurchaseOrder(int n, Product[] products, int[] amount) {
        this.n = n;
        this.products = products;
        this.amount = amount;
        for (int i = 0; i < n; i++) {
            sump += products[i].price * amount[i];
            sumw += products[i].weight * amount[i];
        }
    }

    void printInfo() {
        System.out.println(n + " items = " + sump + " baht " + sumw + " grams");
        for (int i = 0; i < n; i++) {
            int sum = amount[i] * products[i].price;
            System.out.println(products[i].name + " " + amount[i] + "x" + products[i].price + " = " + sum);
        }
    }
}

class Truck {

    int capacity, order, dest, fee;
    PurchaseOrder purchase;

    public Truck(int capacity) {
        this.capacity = capacity;
        dest = 0;
        fee =0;
    }
    
    void add(PurchaseOrder purchase, int dest){
        this.purchase = purchase;
        this.dest = dest;
    }
    
    double getFee(){
        double netFee = (purchase.sumw * dest) / 1000.0 ;
        return netFee;
    }
}

public class ProductShipping3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        Truck[] trucks = new Truck[m];
        for (int i = 0; i < m; i++) {
            int capacity = in.nextInt();
            trucks[i] = new Truck(capacity);
        }
        int n = in.nextInt();
        int dest = in.nextInt();
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
        int minvalue = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < m; i++) {
            if ((trucks[i].capacity >= po.sumw) && (minvalue > trucks[i].capacity)) {
                minvalue = trucks[i].capacity;
                minIndex = i;
            }
        }
        if (minIndex >= 0) {
            trucks[minIndex].add(po, dest);
            System.out.println("Truck#" + (minIndex + 1));
            System.out.println("Fee=" + trucks[minIndex].getFee());
        } else {
            System.out.println("No truck");
            System.out.println("Fee=" + po.sumw * dest / 1000.0);
        }
    }
}
