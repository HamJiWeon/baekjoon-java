import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        char[] numbers = String.valueOf(n).toCharArray();
        
        Arrays.sort(numbers);
        
        StringBuilder sb = new StringBuilder();
        for (int i = numbers.length - 1; i >= 0; i--) {
            sb.append(numbers[i]);
        }
        
        long num = Long.parseLong(sb.toString());
        
        return num;
    }
}