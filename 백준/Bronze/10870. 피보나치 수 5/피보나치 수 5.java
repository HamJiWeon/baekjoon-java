import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long a = 0, b = 1;
        
        for (int i = 2; i <= n; i++) {
            long temp = (a + b) % 1_000_000_007;
            a = b;
            b = temp;
        }
        if (n <= 1) System.out.println(n);
        else System.out.println(b);
    }
}