class Solution {
    public int[] solution(String s) {
        int count = 0;
        int zeroCount = 0;
        
        while (!s.equals("1")) {
            int beforeLen = s.length();
            int afterLen = s.replace("0", "").length();
            
            zeroCount += beforeLen - afterLen;
            
            s = Integer.toBinaryString(afterLen);
            count++;
        }
        
        return new int[]{count, zeroCount};
    }
}