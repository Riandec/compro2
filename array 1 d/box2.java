import java.util.Scanner;


public class box2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] capacitybox = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            capacitybox[i] = sc.nextInt();
        }
        int amountorder = sc.nextInt();
        int[] use_capacitybox = new int[n + 1];
        for(int i=0;i<amountorder;i++){
            int order = sc.nextInt();
            int amount = sc.nextInt();
            if (order == 1) {
                int boxtarget = sc.nextInt();
                if (use_capacitybox[boxtarget] < capacitybox[boxtarget] && amount <= capacitybox[boxtarget] - use_capacitybox[boxtarget]) {
                    use_capacitybox[boxtarget] += amount;
                    System.out.println(use_capacitybox[boxtarget]);
                } else if (amount > capacitybox[boxtarget] - use_capacitybox[boxtarget]) {
                    System.out.println("-1");
                }
            }
            else{
                boolean ch = false;
                for(int j=1 ;j < use_capacitybox.length ;j++){
                    if(amount ==0){
                        break;
                    }
                    if(use_capacitybox[j] - amount >= 0){
                       use_capacitybox[j] -= amount;
                       amount=0;
                       ch = true;
                       System.out.println(j + " " + use_capacitybox[j]);
                    }
                    else{
                        amount -= use_capacitybox[j];
                        use_capacitybox[j] = 0;
                    }
                }
                if(ch == false){
                    System.out.println(n + " " + "0");
                    //System.out.println(n + " " + use_capacitybox[n]);
                }
            }
            
        }
    }
}