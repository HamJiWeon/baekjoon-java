import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        Set<String> listen = new HashSet<>();
        Set<String> see = new HashSet<>();
        
        for (int i = 0; i < N + M; i++) {
            if (i < N) listen.add(sc.next());
            else see.add(sc.next());
        }
        
        see.retainAll(listen);
        
        Set<String> intersection = new HashSet<>(see);
        System.out.println(intersection.size());
        
        List<String> list = new ArrayList<>(intersection);
        Collections.sort(list);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}