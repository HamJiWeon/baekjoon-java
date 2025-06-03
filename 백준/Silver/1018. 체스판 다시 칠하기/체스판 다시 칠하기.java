import java.util.*;

public class Main {
    static char[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = sc.nextLine().toCharArray();
        }

        int minPaint = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                minPaint = Math.min(minPaint, getMinPaint(i, j));
            }
        }

        System.out.println(minPaint);
    }

    public static int getMinPaint(int x, int y) {
        int countStartWithW = 0;
        int countStartWithB = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char expectedW = ((i + j) % 2 == 0) ? 'W' : 'B';
                char expectedB = ((i + j) % 2 == 0) ? 'B' : 'W';

                if (board[x + i][y + j] != expectedW) countStartWithW++;
                if (board[x + i][y + j] != expectedB) countStartWithB++;
            }
        }

        return Math.min(countStartWithW, countStartWithB);
    }
}
