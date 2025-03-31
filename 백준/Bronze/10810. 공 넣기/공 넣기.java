import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] basket = new int[N];
        
        for (int q = 0; q < M; q++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            
            for (int w = i - 1; w < j; w++) basket[w] = k;
        }
        
        for (int x : basket) System.out.print(x + " ");
    }
}