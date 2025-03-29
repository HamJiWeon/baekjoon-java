/*
1 1
2 3
3 4
9 8
5 2
0 0
*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if (a == 0 && b == 0) break;
            
            System.out.println(a + b);
        }
    }
}