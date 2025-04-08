import java.util.*;

class Main {
    public static void main(String[] args) {
        String[][] dialog = {
                {"dummy"}, {"A", "B", "C"}, {"D", "E", "F"},
                {"G", "H", "I"}, {"J", "K", "L"}, {"M", "N", "O"},
                {"P", "Q", "R", "S"}, {"T", "U", "V"}, {"W", "X", "Y", "Z"}
        };

        Scanner sc = new Scanner(System.in);

        String getNumber = sc.nextLine();

        String[] numbers = getNumber.split("");

        int time = 0;
        for (int i = 0; i < dialog.length; i++) {
            for (int j = 0; j < dialog[i].length; j++) {
                for (String s : numbers) {
                    if (s.equals(dialog[i][j])) time += (i + 1);
                }
            }
        }

        System.out.println(time + getNumber.length());
    }
}