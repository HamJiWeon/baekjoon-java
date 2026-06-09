class Solution {
    public String solution(int n) {
        String answer = "수박".repeat(10000);
        
        String s = answer.substring(0, n);
        
        return s;
    }
}