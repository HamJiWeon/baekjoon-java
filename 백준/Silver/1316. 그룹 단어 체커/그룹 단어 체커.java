import java.util.Scanner;

public class Main {
    public static boolean flag(String word) {
        boolean[] seen = new boolean[26];
        char prev = 0;

        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);

            if (current != prev) {
                if (seen[current - 'a']) {
                    return false;
                }
                seen[current - 'a'] = true;
            }

            prev = current;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if (flag(word)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
