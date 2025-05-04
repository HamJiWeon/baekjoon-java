import java.util.*;

class Main {
    public static void main(String[] args) {
        int idx = 2;
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        while (true) {
            if (N % idx == 0) {
                N /= idx;
                System.out.println(idx);
            } else idx++;
            
            if (N == 1) break;
        }
    }
}