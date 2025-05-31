import java.util.Scanner;

public class neogun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] barrier = new int[n+1];
        for (int i = 1; i <= n; i++) {
            barrier[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int countValid = 0;
        int countContDamage = 0;
        int[] mostDamage = new int[n+1];
        for (int i = 0; i < k; i++) {
            int target = sc.nextInt();
            int damage = sc.nextInt();
            if (target <= 0 || target > n) {
                System.out.println("Not valid");
                continue;
            } else {
                countValid++;
                for (int j = target; j >= 1; j--) {
                    if (j >= 1 && damage > 0) {
                        barrier[j] -= damage;
                        mostDamage[j] += damage;
                        if (j != target) {
                            countContDamage++;
                        }
                        damage--;
                    }
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(barrier[i] + " ");
        }
        System.out.println();

        int option = sc.nextInt();
        if (option == 1) {
            System.out.println(countValid);
            System.out.println(countContDamage);
        } else if (option == 2) {
            int max = Integer.MIN_VALUE;
            for (int i = 1; i <= n; i++) {
                // System.out.print(mostDamage[i] + " ");
                if (mostDamage[i] > max) {
                    max = mostDamage[i];
                }
            }
            for (int i = 1; i <= n; i++) {
                if (mostDamage[i] == max) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}