import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        int light = 0, heavy = people.length - 1;
        while (light <= heavy) {
            if (people[light] + people[heavy] > limit) {
                answer++;
                heavy--;
            } else if (people[light] + people[heavy] == limit) {
                answer++;
                light++;
                heavy--;
            } else {
                light++;
                heavy--;
                answer++;
            }
        }
        
        return answer;
    }
}