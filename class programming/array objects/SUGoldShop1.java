
import java.util.Scanner;

class Item{
    public boolean type;
    public double weight;
    public boolean ornament, bar;
    public double goldprice;
    
    public Item(boolean type, double weight){
        this.type = type;
        this.weight = weight;
        if(type == true){
            ornament = type;
        }else if(type == false){
            bar = type;
        }
    }
    
    double saleprice(double goldprice){
        double sale;
        if(ornament){
            sale = (goldprice * weight) + (1000 * weight);
        }else{
            sale = goldprice * weight;
        }
        return sale;
    }
    
    double buyprice(double goldprice){
        double buy;
        if(ornament){
            buy = (goldprice * weight * 98) /100;
        }else{
            buy = (goldprice - 100) * weight;
        }
        return buy;
    }
    
    void showdetail(double goldprice){
        if(ornament){
            System.out.print("ornament " +weight+ " baht");
        }else{
            System.out.print("bar " +weight+ " baht");
        }
    }
}

public class SUGoldShop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double goldprice = sc.nextDouble();
        Item[] arrayx = new Item[n];
        for(int i=0;i<n;i++){
            String option = sc.next();
            String attgold = sc.next();
            double weight = sc.nextDouble();
            if(attgold.equalsIgnoreCase("t")){
                arrayx[i] = new Item(true,weight);
            }else{
                arrayx[i] = new Item(false,weight);
            }
            arrayx[i].showdetail(goldprice);
            if(option.equalsIgnoreCase("s")){
                System.out.println(" sale " +arrayx[i].saleprice(goldprice));
            }else if(option.equalsIgnoreCase("b")){
                System.out.println(" buy " +arrayx[i].buyprice(goldprice));
            }
        }
    }
}
