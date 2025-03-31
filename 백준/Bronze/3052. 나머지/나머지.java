import java.util.*;

class Main {
    public static void main(String[] args) {
        int idx = 0;

        Scanner sc = new Scanner(System.in);
        List <Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            int isNamuji = num % 42;

            if (!list.contains(isNamuji)) {
                list.add(isNamuji);
                idx++;
            }
        }

        System.out.println(idx);
    }
}