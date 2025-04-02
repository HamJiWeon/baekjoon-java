import java.util.*;

class Main {
    public static void main(String[] args) {
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        String numbers = sc.nextLine();

        for (char x : numbers.toCharArray()) sum += (x - '0');

        System.out.println(sum);
    }
}