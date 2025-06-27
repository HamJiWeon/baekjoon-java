import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        
        for (int i = 0; i < a + b; i++) {
            if (i < a) A.add(sc.nextInt());
            else B.add(sc.nextInt());
        }
        
        Set<Integer> AMinusB = new HashSet<>(A);
        Set<Integer> BMinusA = new HashSet<>(B);
        
        AMinusB.removeAll(B);
        BMinusA.removeAll(A);
        
        System.out.println(AMinusB.size() + BMinusA.size());
    }
}