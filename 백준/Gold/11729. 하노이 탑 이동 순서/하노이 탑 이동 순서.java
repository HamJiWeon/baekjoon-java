import java.util.*;

class Main {
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        long moves = (1L << n) - 1;
        System.out.println(moves);
        
        hanoi(n, 1, 3, 2);
        System.out.println(sb.toString());
    }
    
    public static void hanoi(int n, int from, int to, int aux) {
        if (n == 0) return;
        hanoi(n - 1, from, aux, to);
        sb.append(from).append(' ').append(to).append('\n');
        hanoi(n - 1, aux, to, from);
    }
}