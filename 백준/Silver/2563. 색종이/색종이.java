import java.util.*;

class Main {
    public static void main(String[] args) {
        int[][] screen = new int[100][100];

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int side = sc.nextInt();
            int bottom = sc.nextInt();

            for (int j = 99 - bottom; j > 89 - bottom && j >= 0; j--) {
                for (int k = side; k < side + 10; k++) {
                    screen[j][k] = 1;
                }
            }
        }

        int sum = 0;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                sum += screen[i][j];
            }
        }

        System.out.print(sum);
    }
}