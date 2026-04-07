class Solution {
    public long solution(int w, int h) {
        
        return (long) w * h - (w + h - GCD(w, h));
    }
    
    public static int GCD(int a, int b) {
        return b == 0 ? a : GCD(b, a % b);
    }
}