class Solution {
    public String solution(int n) {
        String answer = "수박".repeat(20000);
        
        String s = answer.substring(0, n);
        
        return s;
    }
}