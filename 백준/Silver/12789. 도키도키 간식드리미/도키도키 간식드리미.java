import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            queue.offer(sc.nextInt());
        }

        Deque<Integer> stack = new ArrayDeque<>();
        int idx = 1;

        while (true) {
            if (!queue.isEmpty() && queue.peek() == idx) {
                queue.poll();
                idx++;
            } else if (!stack.isEmpty() && stack.peek() == idx) {
                stack.pop();
                idx++;
            } else if (!queue.isEmpty()) {
                stack.push(queue.poll());
            } else break;
        }

        System.out.println(idx == N + 1 ? "Nice" : "Sad");
    }
}
