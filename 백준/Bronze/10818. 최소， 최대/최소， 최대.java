import java.util.*;

class Main {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        Scanner sc = new Scanner(System.in);
        
        int len = sc.nextInt();
        int[] arr = new int[len];
        
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
            
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        
        System.out.println(min + " " + max);
    }
}