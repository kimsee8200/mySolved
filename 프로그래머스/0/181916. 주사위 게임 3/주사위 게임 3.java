import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        if(a==b&&a==d&&a==c){
            answer = 1111*a;
        }else if(a!=b&&a!=d&&a!=c){
            answer = Math.min(a,Math.min(b,Math.min(c,d)));
        }
        return answer;
    }
}