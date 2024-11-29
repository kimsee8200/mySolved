// 스택 사용
// 1. 스택에 각 단어를 넣음 -> 반복문 활용
// 2. 만약 스택에서 확인 한 조합이 4가지 조건중 하나에 충족하면 pop
// 3. 카운트를 증가 시킴.
import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String temp = "";
        for(String baby: babbling){
            String[] cry = baby.split("");
            for(String alpabet:cry){
                temp += alpabet;
                if(temp.equals("aya")||temp.equals("ye")
                   ||temp.equals("woo")||temp.equals("ma")){
                    temp = "";
                }
               
            }
            if(temp.equals("")){
                answer++;
            }
            temp = "";
        }
        return answer;
    }
}