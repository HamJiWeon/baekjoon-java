import java.util.*;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        
        int year = sc.nextInt();
        
        System.out.println(main.leapYear(year));
    }
    
    public int leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return 1;
        return 0;
    }
}