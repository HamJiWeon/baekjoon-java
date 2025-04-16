import java.util.*;

class Main {
    public static void main(String[] args) {
        double sum1 = 0.000000, sum2 = 0.000000;
        int idx = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            String[] all = sc.nextLine().split(" ");
            double score = Double.parseDouble(all[1]);
            String grade = all[2]
                    .replace("A+", "4.5")
                    .replace("A0", "4.0")
                    .replace("B+", "3.5")
                    .replace("B0", "3.0")
                    .replace("C+", "2.5")
                    .replace("C0", "2.0")
                    .replace("D+", "1.5")
                    .replace("D0", "1.0")
                    .replace("F", "0.0");

            if (!grade.equals("P")) {
                sum1 += (score * Double.parseDouble(grade));
                sum2 += score;
                idx++;
            }
        }

        System.out.println(String.format("%.6f", sum1 / sum2));
    }
}