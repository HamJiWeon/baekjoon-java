import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            int quarter = 25;
            int dime = 10;
            int nickel = 5;
            int penny = 1;
            
            int price = sc.nextInt();
            
            quarter = price / quarter;
            dime = (price - 25 * quarter) / dime;
            nickel = (price - (25 * quarter) - (10 * dime)) / nickel;
            penny = (price - (25 * quarter) - (10 * dime) - (5 * nickel)) / penny;
            
            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}