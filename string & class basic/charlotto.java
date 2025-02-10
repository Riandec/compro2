import java.util.Scanner;

public class charlotto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] luck = new String[12];
        String[] buy = new String[6];
        int[] point = new int[6];
        int sum = 0;
        for(int i=0;i<12;i++){
            luck[i] = sc.next();
        }
        for(int i=0;i<6;i++){
            buy[i] = sc.next();
        }

        for(int i=0;i<6;i++){
            for(int j=0;j<12;j++){
                if(buy[i].equals(luck[j])){
                    point[i]++;
                }
            }
        }
        for(int i=0;i<6;i++){
            System.out.print(point[i] +" ");
            sum += point[i];
        }
        System.out.println();
        System.out.println(sum);
    }
}
