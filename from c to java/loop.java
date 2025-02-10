
public class loop {
    public static void main(String[] args) {
        // for loop
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
        
        // while loop
        int i=0;
        while(i<5){
            System.out.println(i);
            i++;
        }
        
        // infinity loop
        i=0;
        while(true){
            if(i==5){
                break;
            }
            System.out.println(i);
            i++;
        }
    }
}
