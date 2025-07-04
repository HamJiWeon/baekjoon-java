import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        Set<String> set = new HashSet<>();
        
        for (int i = 0; i < N; i++) set.add(sc.next());
        
        int cnt = 0;
        for (int i = 0; i < M; i++) {
            if (set.contains(sc.next())) cnt++;
        }
        
        System.out.println(cnt);
    }
}