import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder result = new StringBuilder();
        
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            
            int len = 1;
            for (int i = 0; i < N; i++) len *= 3;
            
            char[] arr = new char[len];
            Arrays.fill(arr, '-');
            
            if (len > 1) cantor(arr, 0, len);
            
            result.append(arr).append('\n');
        }
        
        System.out.println(result.toString());
    }
    
    static void cantor(char[] arr, int start, int len) {
        if (len == 1) return;
        int third = len / 3;
        
        int midStart = start + third;
        int midEnd = start + 2 * third;
        
        for (int i = midStart; i < midEnd; i++) {
            arr[i] = ' ';
        }
        
        cantor(arr, start, third);
        cantor(arr, start + 2 * third, third);
    }
}