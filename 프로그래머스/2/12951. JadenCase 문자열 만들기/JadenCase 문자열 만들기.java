class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        String[] arr = s.split(" ");
        
        for (int i = 0; i < arr.length; i++) {
            answer.append(arr[i].substring(0, 1).toUpperCase().substring(1));
        }
        
        return answer.toString();
    }
}