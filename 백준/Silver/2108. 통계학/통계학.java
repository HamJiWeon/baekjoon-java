import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] counts = new int[8001];
        long sum = 0;
        int min = 4000, max = -4000;
        
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            sum += x;
            counts[x + 4000]++;
            if (x < min) min = x;
            if (x > max) max = x;
        }
        
        int mean = (int) Math.round(sum / (double) N);
        
        int median = 0;
        int cnt = 0;
        int target = N / 2;
        for (int i = 0; i < counts.length; i++) {
            cnt += counts[i];
            if (cnt > target) {
                median = i - 4000;
                break;
            }
        }
        
        int mode = 0;
        int maxCount = 0;
        for (int c : counts) {
            if (c > maxCount) {
                maxCount = c;
            }
        }
        
        int found = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == maxCount) {
                mode = i - 4000;
                found++;
                if (found == 2) break;
            }
        }
        
        int range = max - min;
        
        StringBuilder sb = new StringBuilder();
        sb.append(mean).append('\n');
        sb.append(median).append('\n');
        sb.append(mode).append('\n');
        sb.append(range).append('\n');
        
        System.out.print(sb.toString());
    }
}
