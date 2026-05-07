class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int lastPos = 0;
        
        for (int s : section) {
            if (s > lastPos) {
                lastPos = s + m - 1;
                answer++;
            }
        }
        
        return answer;
    }
}