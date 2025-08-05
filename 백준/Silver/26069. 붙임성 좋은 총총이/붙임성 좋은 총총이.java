import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        Set<String> dance = new HashSet<>();
        
        dance.add("ChongChong");
        
        for (int i = 0; i < N; i++) {
            String A = sc.next();
            String B = sc.next();
            
            if (dance.contains(A) || dance.contains(B)) {
                dance.add(A);
                dance.add(B);
            }
        }
        
        System.out.println(dance.size());
    }
}