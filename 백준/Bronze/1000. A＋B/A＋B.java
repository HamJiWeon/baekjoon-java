import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int answer = Stream.generate(sc::nextInt)
            .limit(2)
            .mapToInt(Integer::intValue)
            .sum();
        
        System.out.println(answer);
    }
}