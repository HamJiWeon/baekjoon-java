import java.util.*;

class Main {
    static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            cnt = 0;
            
            String S = sc.next();
            System.out.println(isPalindrome(S) + " " + cnt);
        }
    }
    
    static int isPalindrome (String s) {
        return recursion(s, 0, s.length() - 1);
    }
    
    static int recursion (String s, int l, int r) {
        cnt++;
        
        if (l >= r) return 1;
        else if (s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l + 1, r - 1);
    }
}