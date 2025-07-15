import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            int command = sc.nextInt();

            switch (command) {
                case 1:
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    sb.append(stack.isEmpty() ? -1 : stack.pop()).append('\n');
                    break;
                case 3:
                    sb.append(stack.size()).append('\n');
                    break;
                case 4:
                    sb.append(stack.isEmpty() ? 1 : 0).append('\n');
                    break;
                case 5:
                    sb.append(stack.isEmpty() ? -1 : stack.peek()).append('\n');
                    break;
            }
        }

        System.out.print(sb);
    }
}
