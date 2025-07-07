import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            long n = sc.nextLong();
            
            System.out.println(nextPrime(n));
        }
    }
    
    public static long nextPrime(long n) {
        
        if (n <= 2) return 2;
        if (n % 2 == 0) n++;
        
        while (!isPrime(n)) {
            n += 2;
        }
        
        return n;
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