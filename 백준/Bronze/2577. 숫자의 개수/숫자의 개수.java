import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int mul = A * B * C;
        String str = String.valueOf(mul);
        
        char[] ch = str.toCharArray();
        for (int i = 0; i < 10; i++) {
            int cnt = 0;
            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == i + '0') cnt++;
            }
            System.out.println(cnt);
        }
    }
}