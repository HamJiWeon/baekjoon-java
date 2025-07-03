import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];
        
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        int[] diff = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            diff[i] = trees[i + 1] - trees[i];
        }

        int gcd = diff[0];
        for (int i = 1; i < diff.length; i++) {
            gcd = getGCD(gcd, diff[i]);
        }

        int result = 0;
        for (int i = 0; i < diff.length; i++) {
            result += (diff[i] / gcd) - 1;
        }

        System.out.println(result);
    }

    public static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}