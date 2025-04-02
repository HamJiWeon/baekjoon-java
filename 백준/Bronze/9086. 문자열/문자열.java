import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < testcase; i++) {
            String str = sc.nextLine();

            System.out.println(str.charAt(0) + "" + str.charAt(str.length() - 1));
        }
    }
}