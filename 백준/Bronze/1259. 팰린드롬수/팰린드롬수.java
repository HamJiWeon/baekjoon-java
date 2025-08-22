import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        while (true) {
            String s = sc.next();
            
            if (s.equals("0")) break;
            
            if (isPalindrome(s)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
    
    static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        
        return true;
    }
}
