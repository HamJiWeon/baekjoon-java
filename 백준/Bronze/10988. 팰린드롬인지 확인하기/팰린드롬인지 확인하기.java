import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        String p = sc.nextLine();
        String pr = sb.append(p).reverse().toString();
        
        if (p.equals(pr)) System.out.println(1);
        else System.out.println(0);
    }
}