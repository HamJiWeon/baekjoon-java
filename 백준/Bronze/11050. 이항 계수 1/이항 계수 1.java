import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        System.out.println(fac(N) / (fac(N - K) * fac(K)));
    }
    
    static int fac(int num) {
        if (num == 0 || num == 1) return 1;
        
        return num * fac(num - 1);
    }
}

/*
이항 계수
N! / (N - K)!K! 
*/