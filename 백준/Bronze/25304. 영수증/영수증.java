/*
260000
4
20000 5
30000 2
10000 6
5000 8
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = sc.nextInt();
        int num = sc.nextInt();
        
        int sum = 0;
        for (int i = 0; i < num; i++) {
            int price = sc.nextInt();
            int quantity = sc.nextInt();
            sum += price * quantity;
        }
        if (sum != totalPrice) System.out.println("No");
        else System.out.println("Yes");
    }
}