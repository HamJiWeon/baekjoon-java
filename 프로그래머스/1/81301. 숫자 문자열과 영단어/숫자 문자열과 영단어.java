import java.util.*;

class Solution {
    public int solution(String s) {

        HashMap<String, String> number = new HashMap<>();
        
        number.put("zero", "0");
        number.put("one", "1");
        number.put("two", "2");
        number.put("three", "3");
        number.put("four", "4");
        number.put("five", "5");
        number.put("six", "6");
        number.put("seven", "7");
        number.put("eight", "8");
        number.put("nine", "9");

        for (String key : number.keySet()) {
            s = s.replaceAll(key, number.get(key));
        }

        return Integer.parseInt(s);
    }
}