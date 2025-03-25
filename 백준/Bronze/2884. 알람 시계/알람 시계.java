// "45분 일찍 알람 설정하기"

import java.util.*;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(main.time(h, m));
    }
    
    public String time(int h, int m) {
        m -= 45;
        if (m < 0) {
            h -= 1;
            if (h >= 0) return h + " " + (60 + m);
            else return (24 + h) + " " + (60 + m);
        } else return h + " " + m;
    }
}