import java.util.Scanner;

class GameCharacter {
    String name;
    int atk, def, lv;

    public void stat(){
        System.out.println(name+" "+lv+" "+atk+" "+def);
    }
}

class Hero extends GameCharacter {
    public Hero(String name){
        this.name = name;
        atk = 10;
        def = 5;
        lv = 1;
    }
    
    public void hit(Monster mon){
        lv += mon.score/100;
        atk = 10+(3*(lv-1));
        def = 5+(2*(lv-1));
    }
}

class Monster extends GameCharacter {
    int score;
    public Monster(String name, int lv, int score){
        this.name = name;
        this.lv = lv;
        this.score = score;
        atk = 2*lv;
        def = 3*lv;
    }
}

public class RolePlayGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // amount of hero
        Hero[] heros = new Hero[m];
        for(int i=0;i<m;i++){
            String name = sc.next();
            heros[i] = new Hero(name);
        }
        int n = sc.nextInt(); // amount of monster
        Monster[] monsters = new Monster[n];
        boolean[] alive = new boolean[n];
        for(int i=0;i<n;i++){
            int lv = sc.nextInt();
            int score = sc.nextInt();
            monsters[i] = new Monster(null, lv, score);
        }
        int k = sc.nextInt(); // amount of event
        for(int i=0;i<k;i++){
            int numberHero = sc.nextInt()-1;
            int numberMonster = sc.nextInt()-1;
            if(!alive[numberMonster]){
                heros[numberHero].hit(monsters[numberMonster]);
                alive[numberMonster] = !alive[numberMonster];
            }
        }
        for(int i=0;i<m;i++){
            heros[i].stat();
        }
    }
}
