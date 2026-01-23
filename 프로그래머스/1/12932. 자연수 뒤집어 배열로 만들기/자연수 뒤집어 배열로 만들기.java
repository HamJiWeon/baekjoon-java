class Solution {
     public int[] solution(long n) {
        char[] numbers = String.valueOf(n).toCharArray();
        int[] answer = new int[numbers.length];

        for (int i = numbers.length - 1; i >= 0; i--) {
            answer[numbers.length - 1 - i] = Integer.parseInt(String.valueOf(numbers[i]));
        }

        return answer;
    }
}