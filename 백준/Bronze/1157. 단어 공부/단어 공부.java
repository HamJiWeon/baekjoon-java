import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int[] count = new int[26];
        
        word = word.toUpperCase();
        
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            count[c - 'A']++;
        }

        int max = -1;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char) (i + 'A');
            } else if (count[i] == max) result = '?';
        }

        System.out.println(result);
    }
}
