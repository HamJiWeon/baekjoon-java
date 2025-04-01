import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] score = new int[N];

        int max = 0;
        double sum = 0;

        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
            max = Math.max(score[i], max);
        }

        for (double x : score) {
            x = x / max * 100;
            sum += x;
        }

        System.out.print(sum / N);
    }
}