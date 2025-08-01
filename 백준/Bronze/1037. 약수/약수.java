import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int[] arr = new int[a];
        
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        
        if (arr.length > 2) Arrays.sort(arr);
        
        int N = arr[0] * arr[arr.length - 1];
        
        System.out.println(N);
    }
}