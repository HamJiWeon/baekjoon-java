import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        word = word.replace("dz=", "!")
                .replace("c=", "@")
                .replace("c-", "#")
                .replace("d-", "$")
                .replace("lj", "%")
                .replace("nj", "^")
                .replace("s=", "&")
                .replace("z=", "*");

        System.out.println(word.length());
    }
}
