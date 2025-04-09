import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] chess = {1, 1, 2, 2, 2, 8};
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0 ; i < chess.length; i++) {
            int haveChess = sc.nextInt();
            chess[i] -= haveChess;
        }
        
        for (int x : chess) {
            System.out.print(x + " ");
        }
    }
}