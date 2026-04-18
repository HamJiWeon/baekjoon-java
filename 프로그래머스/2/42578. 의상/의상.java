import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for (String[] c : clothes) {
            map.merge(c[1], 1, (a, b) -> a + b);
        }

        for (int v : map.values()) {
            answer *= v + 1;
        }
        
        return answer - 1;
    }
}