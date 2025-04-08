import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 100; i++) {
            try {
                System.out.println(sc.nextLine());
            } catch (RuntimeException e) {
                break;
            }
        }
    }
}
