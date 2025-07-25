import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);

            int command = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1:
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    bw.write((deque.isEmpty() ? -1 : deque.pollFirst()) + "\n");
                    break;
                case 4:
                    bw.write((deque.isEmpty() ? -1 : deque.pollLast()) + "\n");
                    break;
                case 5:
                    bw.write(deque.size() + "\n");
                    break;
                case 6:
                    bw.write((deque.isEmpty() ? 1 : 0) + "\n");
                    break;
                case 7:
                    bw.write((deque.isEmpty() ? -1 : deque.peekFirst()) + "\n");
                    break;
                case 8:
                    bw.write((deque.isEmpty() ? -1 : deque.peekLast()) + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
