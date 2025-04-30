import java.util.*;

class Main {
    public static void main(String[] args) {
        int idx = 0;
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                idx++;
                if (idx == K) System.out.println(i);
            }
        }
        
        if (idx < K) System.out.println(0);
    }
}