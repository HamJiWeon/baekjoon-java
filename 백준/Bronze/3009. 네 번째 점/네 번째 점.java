import java.util.*;

class Main {
    public static void main(String[] args) {
        
        int[] x = new int[3];
        int[] y = new int[3];
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        
        int lastPointX = (x[0] == x[1]) ? x[2] : (x[0] == x[2]) ? x[1] : x[0];
        int lastPointY = (y[0] == y[1]) ? y[2] : (y[0] == y[2]) ? y[1] : y[0];
        
        System.out.println(lastPointX + " " + lastPointY);
    }
}