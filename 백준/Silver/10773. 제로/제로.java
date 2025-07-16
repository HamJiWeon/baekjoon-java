import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        
        int K = sc.nextInt();
        
        for (int i = 0; i < K; i++) {
            int n = sc.nextInt();
            
            if (n != 0) stack.push(n);
            else stack.pop();
        }
        
        int size = stack.size();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += stack.pop();
        }
        
        System.out.println(sum);
    } 
}