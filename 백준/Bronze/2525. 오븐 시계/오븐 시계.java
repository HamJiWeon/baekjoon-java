import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        int ovenTimer = sc.nextInt();
        
        m += ovenTimer;
        h += m / 60;
        m = m % 60;
        
        if (h > 23) h -= 24;
        
        System.out.println(h + " " + m);
    }
}