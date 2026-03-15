class Solution {
    public int solution(int n) {
        
        StringBuilder sb = new StringBuilder();
        
        String three = Integer.toString(n, 3);
        
        return Integer.parseInt(sb.append(three).reverse().toString(), 3);
    }
}