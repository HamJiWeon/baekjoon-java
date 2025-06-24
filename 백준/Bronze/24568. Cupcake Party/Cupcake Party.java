import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int R = sc.nextInt();
        int S = sc.nextInt();
        
        int leftOver = (R * 8 + S * 3) - 28;
        
        System.out.println(leftOver);
    }
}