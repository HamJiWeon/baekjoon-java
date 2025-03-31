import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N];

        for (int q = 0; q < N; q++) basket[q] = q + 1;

        for (int w = 0; w < M; w++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int temp = basket[i - 1];
            basket[i - 1] = basket[j - 1];
            basket[j - 1] = temp;
        }

        for (int x : basket) System.out.print(x + " ");
    }
}