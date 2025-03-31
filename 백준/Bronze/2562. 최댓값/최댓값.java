import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = new int[9];
        int max = Integer.MIN_VALUE;
        int idx = 0;
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx + 1);
    }
}