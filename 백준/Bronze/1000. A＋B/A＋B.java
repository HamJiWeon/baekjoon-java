import java.util.*;

public class Main {
    public int solution(int a, int b) {
        int answer = a + b;
        
        return answer;
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(main.solution(a, b));
    }
}