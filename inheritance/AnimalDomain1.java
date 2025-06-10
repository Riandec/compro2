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
}

public class AnimalDomain1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Animal> ani = new ArrayList<>();
        for(int i=0;i<n;i++){
            int type = sc.nextInt();
            if(type == 1){
                String name = sc.next();
                int lifeExpect = sc.nextInt();
                Animal an = new Animal(name,lifeExpect);
                ani.add(an);
            }else if(type == 2){
                int id = sc.nextInt();
                int year = sc.nextInt();
                ani.get(id-1).live(year);
            }else if(type == 3){
                int id = sc.nextInt();
                ani.get(id-1).isAlive();
            }
        }
    }
}
