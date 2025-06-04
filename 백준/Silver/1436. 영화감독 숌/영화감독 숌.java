import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int number = 666;

        while (true) {
            if (String.valueOf(number).contains("666")) {
                count++;
                if (count == n) {
                    System.out.println(number);
                    break;
                }
            }
            number++;
        }
    }
}
