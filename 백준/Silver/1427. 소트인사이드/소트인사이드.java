import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String N = sc.nextLine();
        char[] arr = N.toCharArray();
        
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder(new String(arr));
        String answer = sb.reverse().toString();
        
        System.out.println(answer);
    }
}