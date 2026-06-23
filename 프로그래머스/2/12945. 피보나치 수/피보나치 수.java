class Solution {
    public int solution(int n) {
        int answer = 0;
        // 1 1 2 3 5 8 13 21
        
        int prev1 = 1;
        int prev2 = 1;
        
        if (n == 2) return 1;
        
        for (int i = 3; i <= n; i++) {
            answer = (prev1 + prev2) % 1234567;
            prev2 = prev1;
            prev1 = answer;
        }
        
        return answer;
    }
}