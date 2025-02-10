
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

public class CharVoice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        Character[] ch = new Character[c];
        for(int i=0;i<c;i++){
            int n = sc.nextInt();
            String[] word = new String[n];
            sc.nextLine();
            for(int j=0;j<n;j++){
                word[j] = sc.nextLine();
            }
            ch[i] = new Character(word);
        }
        int k = sc.nextInt();
        for(int m=0;m<k;m++){
            int num = sc.nextInt()-1;
            ch[num].speak();
        }
    }
}
