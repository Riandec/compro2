/*
import java.util.Scanner;

class Character{
    private String[] word;
    private int count = 0;
    
    public Character(String[] word){
        this.word = word;
    }
    
    void speak(){
        System.out.println(word[count % word.length]);
        count++;
    }
}

public class CharVoice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] msg = new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++){
            msg[i] = sc.nextLine();
        }
        int k = sc.nextInt();
        Character ch = new Character(msg);
        for(int i=0;i<k;i++){
            ch.speak();
        }
    }
}
*/