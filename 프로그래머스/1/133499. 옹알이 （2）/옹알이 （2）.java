class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] speaks = {"aya", "ye", "woo", "ma"};
        
        for (String word : babbling) {
            
            boolean isRepeat = false;
            for (String speak : speaks) {
                if (word.contains(speak + speak)) {
                    isRepeat = true;
                    break;
                }
            }
            
            if (isRepeat) continue;
            
            for (String speak : speaks) {
                word = word.replace(speak, " ");
            }
            
            if (word.trim().isEmpty()) answer++;
        }
        
        return answer;
    }
}