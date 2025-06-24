import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int cnt = 0;
        int clone = N;
        while(true) {
            int ten = clone / 10;
            int one = clone % 10;
            
            int num = ten + one;
            int newNum = (one * 10) + (num % 10);
            
            cnt++;
            if (N == newNum) break;
            else clone = newNum;
        }
        System.out.print(cnt);
    }
}