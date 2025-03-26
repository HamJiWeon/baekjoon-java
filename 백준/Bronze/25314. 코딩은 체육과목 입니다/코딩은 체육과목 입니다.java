import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int b = sc.nextInt();
        
        for (int i = 0; i < b / 4; i++) {
            System.out.printf("long ");
        }
        System.out.printf("int");
    }
}