import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int star = sc.nextInt();

        for (int i = 1; i <= star; i++) {
            sb.append("*");
            System.out.println(sb);
        }
    }
}