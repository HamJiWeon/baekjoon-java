import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] tokens = br.readLine().split(" ");
        Deque<int[]> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int move = Integer.parseInt(tokens[i]);
            deque.add(new int[]{i + 1, move});
        }

        StringBuilder sb = new StringBuilder();

        int[] current = deque.pollFirst();
        sb.append(current[0]).append(" ");

        while (!deque.isEmpty()) {
            int move = current[1];

            int size = deque.size();
            if (move > 0) {
                int step = (move - 1) % size;
                for (int i = 0; i < step; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                int step = (Math.abs(move)) % size;
                for (int i = 0; i < step; i++) {
                    deque.addFirst(deque.pollLast());
                }
            }

            current = deque.pollFirst();
            sb.append(current[0]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
