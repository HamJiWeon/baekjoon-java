import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            if (name.length() >= M) {
                map.put(name, map.getOrDefault(name, 0) + 1);
            }
        }

        List<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                int freqCmp = map.get(b).compareTo(map.get(a));
                if (freqCmp != 0) return freqCmp;
                int lenCmp  = b.length() - a.length();
                if (lenCmp != 0) return lenCmp;
                return a.compareTo(b);
            }
        });

        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.flush();
    }
}
