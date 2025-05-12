import java.util.*;

class Main {
    public static void main(String[] args) {
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);
        }
        
        if (N == 1) System.out.println(0);
        else System.out.println((maxX - minX) * (maxY - minY));
    }
}