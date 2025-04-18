import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] words = new String[5];
        int maxLen = 0;

        for (int i = 0; i < 5; i++) {
            words[i] = sc.nextLine();
            maxLen = Math.max(maxLen, words[i].length());
        }

        StringBuilder sb = new StringBuilder();

        for (int col = 0; col < maxLen; col++) {
            for (int row = 0; row < 5; row++) {
                if (col < words[row].length()) {
                    sb.append(words[row].charAt(col));
                }
            }
        }

        System.out.println(sb.toString());
    }
}
