import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        
        String S = sc.nextLine();
        
        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j <= S.length(); j++) {
                 set.add(S.substring(i, j));
            }
        }
        
        System.out.println(set.size());
    }
}