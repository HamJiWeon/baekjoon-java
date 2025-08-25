import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] prefix = new long[N + 1]; // 1-based, prefix[0] = 0

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            // 입력이 여러 줄로 올 수도 있으니 토큰 고갈 시 새 줄 읽기
            while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            prefix[i] = prefix[i - 1] + x;
        }

        StringBuilder sb = new StringBuilder();
        for (int q = 0; q < M; q++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            long sum = prefix[r] - prefix[l - 1];
            sb.append(sum).append('\n');
        }
        System.out.print(sb);
    }
}