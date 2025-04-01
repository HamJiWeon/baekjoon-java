import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N + 1];
        for (int i = 1; i <= N; i++) basket[i] = i;

        for (int q = 0; q < M; q++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            while (i < j) {
                int temp = basket[i];
                basket[i] = basket[j];
                basket[j] = temp;
                i++;
                j--;
            }
        }

        for (int i = 1; i < basket.length; i++) System.out.print(basket[i] + " ");
    }
}