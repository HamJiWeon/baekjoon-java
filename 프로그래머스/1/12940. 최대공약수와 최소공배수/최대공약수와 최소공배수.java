class Solution {
    public int[] solution(int n, int m) {
        return new int[]{GCD(n, m), LCM(n, m)};
    }
    
    private int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }
    
    private int GCD(int a, int b){
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        
        return a;
    }
}