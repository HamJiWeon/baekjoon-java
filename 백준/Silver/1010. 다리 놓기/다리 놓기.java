import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
        
            if (N == M) {
                System.out.println(1);
            } else {
                System.out.println(combination(M, N));
            }
        }
    }

    static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    static BigInteger combination(int m, int n) {
        return factorial(m).divide(factorial(n).multiply(factorial(m - n)));
    }
}
