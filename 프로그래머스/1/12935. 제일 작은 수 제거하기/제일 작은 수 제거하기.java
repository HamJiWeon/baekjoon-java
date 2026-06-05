class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        
        if (arr.length <= 1) return new int[]{-1};
        
        int min = Integer.MAX_VALUE;
        for (int n : arr) {
            min = Math.min(min, n);
        }
        
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) continue;
            answer[idx] = arr[i];
            idx++;
        }
        
        return answer;
    }
}