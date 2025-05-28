import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a0 = sc.nextInt();

        int c = sc.nextInt();
        int n0 = sc.nextInt();

        boolean isValid = true;
        for (int n = n0; n <= 100; n++) {
            int fn = a1 * n + a0;
            int gn = c * n;
            if (fn > gn) {
                isValid = false;
                break;
            }
        }

        System.out.println(isValid ? 1 : 0);
    }
}
