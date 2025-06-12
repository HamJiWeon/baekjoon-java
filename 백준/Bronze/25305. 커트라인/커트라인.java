import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        
        int N = scanner.nextInt();
        int k = scanner.nextInt();
        
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }
        
        list.sort(Comparator.reverseOrder());
        
        System.out.println(list.get(k - 1));
    }
}