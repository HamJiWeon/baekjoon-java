import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 카운팅 배열 크기 (1~10000까지)
        int[] count = new int[10001];

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            while (count[i]-- > 0) {
                sb.append(i).append('\n');
            }
        }

        System.out.print(sb);
    }
}
