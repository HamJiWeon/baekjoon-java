import java.util.*;

class Main {
    static final int max = 1_000_000;
    static boolean[] isPrime = new boolean[max + 1];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 

        getPrimes();

        while (T-- > 0) {
            int N = sc.nextInt();
            int count = 0;

            for (int i = 2; i <= N / 2; i++) {
                if (isPrime[i] && isPrime[N - i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    static void getPrimes() {
        for (int i = 2; i <= max; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
