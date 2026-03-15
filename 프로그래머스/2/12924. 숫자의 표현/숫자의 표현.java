class Solution {
    public int solution(int n) {
        int answer = 0, lt = 1, rt = 1, sum = 1;
        
        while (lt <= n) {
            if (sum < n) {
                rt++;
                sum += rt;
            } else if (sum > n) {
                sum -= lt;
                lt++;
            } else {
                answer++;
                sum -= lt;
                lt++;
            }
        }
        
        return answer;
    }
}