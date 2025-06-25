import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < M; i++) {
            int query = sc.nextInt();
            
            sb.append(map.getOrDefault(query, 0)).append(" ");
        }
        
        System.out.print(sb);
    }
}