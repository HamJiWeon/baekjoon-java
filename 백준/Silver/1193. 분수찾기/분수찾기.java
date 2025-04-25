import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int diagonal = 1;
        while (X > diagonal) {
            X -= diagonal;
            diagonal++;
        }

        if (diagonal % 2 == 0) {
            System.out.println(X + "/" + (diagonal - X + 1));
        } else {
            System.out.println((diagonal - X + 1) + "/" + X);
        }
    }
}
