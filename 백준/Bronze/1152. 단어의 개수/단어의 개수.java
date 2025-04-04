import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] splitStr = str.split(" ");

        int length = splitStr.length;
        for (String x : splitStr) {
            if (x == "") {
                length--;
            }
        }
        System.out.println(length);
    }
}