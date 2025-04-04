import java.util.*;

class Main {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < len; i++) {
            String ev = sc.nextLine();

            String[] evs = ev.split(" ");

            int repeat = Integer.parseInt(evs[0]);
            String str = evs[1];

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < repeat; k++) {
                    sb.append(str.charAt(j));
                }
            }

            System.out.println(sb);
            sb.setLength(0);
        }
    }
}