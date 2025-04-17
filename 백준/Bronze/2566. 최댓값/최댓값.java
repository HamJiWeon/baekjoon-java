import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int findMaxNum = Integer.MIN_VALUE;
        int x = 0, y = 0;
        int[][] arr = new int[9][9];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
                
                if (findMaxNum < arr[i][j]) {
                    findMaxNum = arr[i][j];
                    x = i + 1;
                    y = j + 1;
                }                
            }
        }
        
        System.out.println(findMaxNum);
        System.out.print(x + " " + y);
    }
}