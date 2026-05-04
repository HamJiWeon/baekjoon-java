class Solution {
    public String solution(int a, int b) {
        String[][] calendar = {
                {"NULL"},
                {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"},
                {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"},
                {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"},
                {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"},
                {"SAT", "SUN", "MON", "TUE", "WED", "THU", "FRI"},
                {"TUE", "WED", "THU", "FRI", "SAT", "SUN", "MON"},
                {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"},
                {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"},
                {"WED", "THU", "FRI", "SAT", "SUN", "MON", "TUE"},
                {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"},
                {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"},
                {"WED", "THU", "FRI", "SAT", "SUN", "MON", "TUE"}
        };

        return calendar[a][b % 7];
    }
}