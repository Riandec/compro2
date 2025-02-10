
import java.util.Scanner;

public class ProcessInfo {
    static boolean listProcesses(String[] name, int[] used, int ram) {
        int count = 0;
        for(int i=0;i<name.length;i++){
            System.out.print(name[i]);
            if(used[i] >= 10){
                System.out.println("* "+ used[i]);
            }else{
                System.out.println(" "+ used[i]);
            }
            count += used[i];
        }
        System.out.println("RAM used = " +count+ " out of " +ram);
        if(count <= ram){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] used = new int[n];
        for(int i=0;i<n;i++){
            name[i] = sc.next();
            used[i] = sc.nextInt();
        }
        int ram = sc.nextInt();
        boolean check = listProcesses(name,used,ram);
        if(check){
            System.out.println("Sufficient RAM");
        }else{
            System.out.println("Not enough RAM");
        }
    }
}
