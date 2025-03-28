/*
Case #1: 2
Case #2: 5
Case #3: 7
Case #4: 17
Case #5: 7
*/
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        
        for (int i = 0; i < length; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            System.out.println("Case #" + (i + 1) + ": " + (a + b));
        }
    }
}