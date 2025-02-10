
import java.util.Scanner;

class Encoder {

    String[] vocab;
    int[] id;

    public Encoder(String[] vocab, int[] id) {
        this.vocab = vocab;
        this.id = id;
    }

    private int encodeWord(String entry) {
        for (int i = 0; i < vocab.length; i++) {
            if (entry.equals(vocab[i])) {
                return id[i];
            }
        }
        return -1;
    }

    int[] encodeMsg(String[] entry) {
        int[] result = new int[entry.length];
        for (int i = 0; i < entry.length; i++) {
            result[i] = encodeWord(entry[i]);
        }
        return result;
    }
}

class Decorder{
    String[] vocab;
    int[] id;
    
    public Decorder(String[] vocab, int[] id){
        this.vocab = vocab;
        this.id = id;
    }
    
    private String decordWord(int num){
        for(int i=0;i<vocab.length;i++){
            if(num == id[i]){
                return vocab[i] +" ";
            }
        }
        return "? ";
    }
    
    String decodeMsg(int[] entryid){
        String result = "";
        for(int i=0;i<entryid.length;i++){
            result += decordWord(entryid[i]);
        }
        return result;
    }
}

public class EnDecoder2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] vocab = new String[n];
        int[] id = new int[n];
        for (int i = 0; i < n; i++) {
            vocab[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            id[i] = sc.nextInt();
        }
        Encoder en = new Encoder(vocab, id);
        Decorder de = new Decorder(vocab,id);
        int k = sc.nextInt();
        String[] entry = new String[k];
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            entry[i] = sc.next();
        }
        result = en.encodeMsg(entry);
        System.out.println(de.decodeMsg(result));
    }
}
