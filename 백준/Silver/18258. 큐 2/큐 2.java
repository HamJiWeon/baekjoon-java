import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            
            switch (cmd) {
                case "push":
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                    
                case "pop":
                    sb.append(deque.isEmpty() ? -1 : deque.removeFirst()).append('\n');
                    break;
                    
                case "size":
                    sb.append(deque.size()).append('\n');
                    break;
                    
                case "empty":
                    sb.append(deque.isEmpty() ? 1 : 0).append('\n');
                    break;
                    
                case "front":
                    sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append('\n');
                    break;
                    
                case "back":
                    sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append('\n');
                    break;
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
    }
}
