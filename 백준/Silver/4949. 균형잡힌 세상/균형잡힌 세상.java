import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            if (line.equals(".")) {
                break;
            }
            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;
            for (char c : line.toCharArray()) {
                if (c == '(') {
                    stack.push(')');
                } else if (c == '[') {
                    stack.push(']');
                } else if (c == ')' || c == ']') {
                    if (stack.isEmpty() || stack.pop() != c) {
                        isBalanced = false;
                        break;
                    }
                }
            }
            if (isBalanced && stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}