import java.util.Scanner;

class Student {
    final static int numTest = 4;
    public String firstName, lastName;
    private int[] stepScore;

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        stepScore = new int[numTest];
    }
    public int getTestScore(int type){
        return stepScore[type-1];
    }
    public void setTestScore(int type, int score){
        stepScore[type-1] = score;
    }
    public int computeTotal(){
        int sum = 0;
        for(int i=0;i<numTest;i++){
            sum += stepScore[i];
        }
        return sum;
    }
    public void printInfo(){
        System.out.println(firstName+" "+lastName+" "+computeTotal());
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] roster = new Student[n];
        for(int i=0;i<n;i++){
            String fname = sc.next();
            String lname = sc.next();
            roster[i] = new Student(fname, lname);
            for(int j=1;j<=4;j++){
                int score = sc.nextInt();
                roster[i].setTestScore(j, score);
            }
            roster[i].printInfo();
        }
        int k = sc.nextInt();
        for(int i=0;i<k;i++){
            int rosterNum = sc.nextInt()-1;
            int testNum = sc.nextInt();
            
            System.out.println(roster[rosterNum].getTestScore(testNum));
        }
    }
}

/* testcase
2
Peter Parker 11 21 22 23
Tony Stark 10 15 20 25
4
1 1
1 3
2 2
2 4
*/