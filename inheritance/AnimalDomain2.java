
import java.util.ArrayList;
import java.util.Scanner;

class Animal{
    String name;
    int lifeExpect;
    int age;
    
    public Animal(String name, int lifeExpect){
        this.name = name;
        this.lifeExpect = lifeExpect;
        age = 0;
        if(lifeExpect > 0){
            System.out.println(name +" was born with life expectancy "+lifeExpect+" year(s)");
        }
    }
    
    void live(int year){
        if(age == lifeExpect){
            System.out.println(name +" died earlier");
        }else if(age+year < lifeExpect){
            if(year == 1){
                System.out.println(name +" lived "+ year+ " more year");
            }else{
                System.out.println(name +" lived "+ year+ " more years");
            }
            age += year;
        }else if(age+year == lifeExpect){
            if(year == 1){
                System.out.println(name +" lived 1 more year and died");
            }else{
                System.out.println(name +" lived "+ year+" more years and died");
            }
            age += year;
        }else{
            int tmp = lifeExpect-age;
            if(tmp == 1){
                System.out.println(name +" lived "+ tmp+" more year and died");
            }else{
                System.out.println(name +" lived "+ tmp+" more years and died");
            }
            age = lifeExpect;
        }
    }
    
    boolean isAlive(){
        if(age < lifeExpect){
            System.out.println(name +" is alive");
            return true;
        }else{
            System.out.println(name +" is dead");
            return false;
        }
    }
    void vaccine(){
        System.out.println(name +"'s life expectancy is now " +lifeExpect+" year(s)");
    }
}

class Dog extends Animal{
    
    public Dog(String name){
        super(name,8); 
    }
    int v = 0;
    
    @Override
    void vaccine(){
       if(v == 0){
           lifeExpect = ((lifeExpect-age)*2)+age;
       }
       super.vaccine();
       v++;
    }
}

class Turtle extends Animal{
   
    public Turtle(String name){
        super(name,50);
    }
}

class Salmon extends Animal{
    
    public Salmon(String name){
        super(name,4);
    }
}
        
public class AnimalDomain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Animal> ani = new ArrayList<>();
        for(int i=0;i<n;i++){
            int type = sc.nextInt();
            if(type == 1){
                int aniType = sc.nextInt();
                String name = sc.next();
                if(aniType == 1){
                    Dog d = new Dog(name);
                    ani.add(d);
                }else if(aniType == 2){
                    Turtle t = new Turtle(name);
                    ani.add(t);
                }else if(aniType == 3){
                    Salmon s = new Salmon(name);
                    ani.add(s);
                }
            }else if(type == 2){
                int p = sc.nextInt();
                int k = sc.nextInt();
                ani.get(p-1).live(k);
            }else if(type == 3){
                int p = sc.nextInt();
                ani.get(p-1).isAlive();
            }else if(type == 4){
                int p = sc.nextInt();
                ani.get(p-1).vaccine();
            }
        }
    }
}
