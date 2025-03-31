import java.util.*;

class Main {
    public static void main(String[] args) {
        boolean[] rollBook = new boolean[31];
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 28; i++) {
            int student = sc.nextInt();
            
            rollBook[student] = true;
        }
        
        for (int i = 1; i <= 30; i++) {
            if (rollBook[i] == false) System.out.println(i);
        }
    }
}