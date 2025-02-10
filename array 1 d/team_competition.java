
import java.util.Scanner;

public class team_competition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] team1 = new int[n];
        for (int i = 0; i < n; i++) {
            team1[i] = sc.nextInt();
        }
        int[] team2 = new int[n];
        for (int i = 0; i < n; i++) {
            team2[i] = sc.nextInt();
        }
        
        int score1 = 0;
        int score2 = 0;
        for (int i = 0; i < n; i++) {
            if(team1[i]>team2[i]){
                score1+=2;
            }else if(team2[i]>team1[i]){
                score2+=2;
            }else if(team1[i]==team2[i]){
                score1++;
                score2++;
            }
        }
        
        if(score1>score2){
            System.out.println("Team 1 wins");
            System.out.println("Score " +score1+ " to " +score2);
        }else if(score2>score1){
            System.out.println("Team 2 wins");
            System.out.println("Score " +score2+ " to " +score1);
        }else{
            System.out.println("Draw game");
            System.out.println("Score " +score1+ " to " +score2);
        }
    }
}
