import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder(N * (N + 1));
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                sb.append(isBlank(r, c) ? ' ' : '*');
            }
            
            sb.append('\n');
        }
        
        System.out.print(sb.toString());
    }
    
    static boolean isBlank(int r, int c) {
        while (r > 0 || c > 0) {
            if (r % 3 == 1 && c % 3 == 1) return true;
            r /= 3;
            c /= 3;
        }
        
        return false;
    }
}