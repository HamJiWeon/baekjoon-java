import java.util.*;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();


        for (int i = 0; i < len; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(main.sum(a, b));
        }
    }

    int sum(int a, int b) {
        return a + b;
    }
}