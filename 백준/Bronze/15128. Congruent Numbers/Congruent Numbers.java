/*
합동수는 삼각형의 각 변의 길이가 유리수인 직각삼각형의 넓이인 정수입니다. 이 문제에 대해서는 빗변이 아닌 직각삼각형의 다리만 고려하겠습니다.

유리수는 분수 p/q로, 여기서 분자인 p와 분모인 q는 정수입니다. q = 1이면 p/1은 정수이므로 모든 정수는 유리수입니다.

직각 삼각형의 빗변 다리인 두 개의 유리수가 주어졌을 때, 그 삼각형의 넓이가 합동인지 여부를 결정합니다. 이 문제의 목적상 빗변의 길이가 유리수일 필요는 없습니다.
*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long p1 = sc.nextInt();
        long q1 = sc.nextInt();
        long p2 = sc.nextInt();
        long q2 = sc.nextInt();
        
        long numerator = p1 * p2;
        long denominator = 2 * q1 * q2;
        
        if (numerator % denominator == 0) System.out.print(1);
        else System.out.print(0);
    }
}