import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        
        int denominator = a * e - b * d;
        int xNum = c * e - b * f;
        int yNum = a * f - c * d;
        
        int x = xNum / denominator;
        int y = yNum / denominator;
        
        System.out.println(x + " " + y);
    }
}