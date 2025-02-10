/*
import java.util.Scanner;

class House{
    int landSize;
    int quality;
    int floors;
    int houseArea;
    public int price;
    
    public House(int landSize, int quality, int floors, int houseArea){
        this.landSize = landSize;
        this.quality = quality;
        this.floors = floors;
        this.houseArea = houseArea;
        price = computePrice(landSize,quality,floors,houseArea);
    }
    
    int computePrice(int landSize, int quality, int floors, int houseArea){
        landSize = landSize * 10000;
        if(floors > 1){
            floors = (floors-1) * 200000;
        }else{
            floors = 0;
        }
        if(quality == 1){
            houseArea = houseArea * 10000;
        }else if(quality == 2){
            houseArea = houseArea * 8000;
        }else if(quality == 3){
            houseArea = houseArea * 5000;
        }
        int sum = landSize+floors+houseArea;
        return sum;
    }
}

public class HousePrice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int landSize = sc.nextInt();
        int quality = sc.nextInt();
        int floors = sc.nextInt();
        int houseArea = sc.nextInt();
        House hs = new House(landSize,quality,floors,houseArea);
        System.out.println(landSize +" "+ quality +" "+ floors +" "+ houseArea);
        System.out.println(hs.computePrice(landSize, quality, floors, houseArea));
    }
}
*/