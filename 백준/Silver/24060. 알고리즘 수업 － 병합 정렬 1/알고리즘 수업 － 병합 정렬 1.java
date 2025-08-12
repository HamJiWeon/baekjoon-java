import java.util.*;

public class Main {
    static int N, K;
    static int[] A, tmp;
    static long count = 0;
    static int answer = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();

        A = new int[N];
        tmp = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        mergeSort(0, N - 1);
        System.out.println(answer);
        sc.close();
    }

    static void mergeSort(int left, int right) {
        if (left >= right) return;
        int mid = (left + right) >>> 1;
        mergeSort(left, mid);
        mergeSort(mid + 1, right);
        merge(left, mid, right);
    }

    static void merge(int left, int mid, int right) {
        int i = left, j = mid + 1, t = left;

        while (i <= mid && j <= right) {
            if (A[i] <= A[j]) tmp[t++] = A[i++];
            else tmp[t++] = A[j++];
        }
        
        while (i <= mid) tmp[t++] = A[i++];
        while (j <= right) tmp[t++] = A[j++];

        for (int k = left; k <= right; k++) {
            A[k] = tmp[k];
            
            if (++count == K) answer = A[k];
        }
    }
}
