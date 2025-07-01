import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
            long A = sc.nextLong();
            long B = sc.nextLong();
            
            System.out.println(lcm(A, B));
    }
    
    public static long lcm(long a, long b) {
            return (a * b) / gcd(a, b);
        }
        
        public static long gcd(long a, long b) {
            while (b != 0) {
                long temp = b;
                b = a % b;
                a = temp;
            }
            
            return a;
        }
}