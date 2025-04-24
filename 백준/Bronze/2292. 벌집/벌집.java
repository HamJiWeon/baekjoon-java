import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        int layer = 1;
        long maxNumberInLayer = 1;

        while (maxNumberInLayer < N) {
            maxNumberInLayer += 6 * layer;
            layer++;
        }

        System.out.println(layer);
    }
}
