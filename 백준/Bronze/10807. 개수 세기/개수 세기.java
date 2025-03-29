import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        sc.nextLine();
        String[] numbers = sc.nextLine().split(" ");
        int findNumber = sc.nextInt();

        int cnt = 0;
        for (int i = 0; i < len; i++) {
            if (Integer.parseInt(numbers[i]) == findNumber) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}