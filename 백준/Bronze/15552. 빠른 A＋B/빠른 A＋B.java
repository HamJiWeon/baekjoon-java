import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int len = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < len; i++) {
            String[] input = br.readLine().split(" ");
            
            int sum = Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
            
            bw.write(sum + "\n");
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}