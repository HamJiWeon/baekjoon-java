import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        
        return sb.append(ch).reverse().toString();
    }
}