import java.util.*;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        
        int score = sc.nextInt();
        
        System.out.println(main.grade(score));
    }
    
    public String grade(int score) {
        if (score >= 90) return "A";
        else if (score < 90 && score >= 80) return "B";
        else if (score < 80 && score >= 70) return "C";
        else if (score < 70 && score >= 60) return "D";
        else return "F";
    }
}