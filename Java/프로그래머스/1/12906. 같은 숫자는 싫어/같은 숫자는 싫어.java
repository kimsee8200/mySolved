/*
반환 값: 연속적으로 중복 값을 제거 하기
1. 주어진 배열의 요소를 스텍에 넣기
-> for문 반복하여, 각 요소를 스텍에 넣는다

2. 만약 요소를 넣을때 top과 들어갈 요소의 수가 같을 때는 넘어간다.
-> if, continue 사용. 만약 스텍에 아무것도 안들어가 있을 경우에도 넘어간다.

3. 모두 끝난후 모든 요소를 pop시켜, 배열을 스텍의 길이 만큼 선언하고, 맨 끝 부분부터 집어넣는다.

*/



import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack stack = new Stack();
        // 요소를 스텍에 넣고, 비교하는 코드
        for(int num : arr){
            if(!stack.isEmpty()){
                if((int)stack.peek() == num){
                    continue;
                }
            }
            stack.push(num);
        }
        
        // 길이 만큼 배열을 생성
        answer = new int[(int)stack.size()];
        int i = (int)stack.size()-1;
        while(!stack.isEmpty()){
            answer[i] = (int)stack.pop();
            i--;
        }
        return answer;
    }
}