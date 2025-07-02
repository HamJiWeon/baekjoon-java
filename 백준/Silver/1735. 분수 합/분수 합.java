import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        
        int lcm = lcm(b1, b2);
        
        int numerator = a1 * (lcm / b1) + a2 * (lcm / b2);
        int denominator = lcm;
        
        int gcd = gcd(numerator, denominator);
        
        numerator /= gcd;
        denominator /= gcd;
        
        System.out.println(numerator + " " + denominator);
    }
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        
        return a;
    }
    
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}