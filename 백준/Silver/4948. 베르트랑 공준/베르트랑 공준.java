import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int cnt = 0;
            long n = sc.nextInt();
            
            if (n == 0) break;
            
            for (long i = n + 1; i <= 2 * n; i++) {
                if (isPrime(i)) cnt++;
            }
            
            System.out.println(cnt);
        }
    }
    
    public static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
}