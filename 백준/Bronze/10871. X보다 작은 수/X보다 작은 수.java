import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int x = sc.nextInt();
        
        int[] arr = new int[len];
        
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < x) System.out.println(arr[i]);
        }
    }
}