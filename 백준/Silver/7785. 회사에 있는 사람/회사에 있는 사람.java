import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            String attendance = sc.next();
            
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        
        List<String> list = new ArrayList<>();
                
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) list.add(entry.getKey());
        }
        
        list.sort(Comparator.reverseOrder());
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}