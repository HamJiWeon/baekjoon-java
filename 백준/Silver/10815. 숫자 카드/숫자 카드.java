import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Set<Integer> sangguenCard = new HashSet<>();
        
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            sangguenCard.add(sc.nextInt());
        }
        
        int M = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < M; i++) {
            int compareCard = sc.nextInt();
            
            if (sangguenCard.contains(compareCard)) sb.append("1 ");
            else sb.append("0 ");
        }
        
        System.out.println(sb);
    }
}