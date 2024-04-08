/*
반환 값 -> 가격이 떨어지지 않은 기간이 몇초?

조건 초 단위로 기록된 주식 가격이 담긴 배열 price.
-> 이해한 부분, 
1. 하나의 주식이다.
2. 떨어지지 않은 기간은, 각각의 prices 요소를 기준으로 각각을 젠다.
3. 

문제 풀이 단계

1. prices 의 요소 하나를 집어온다.
2. count를 두어 초를세게 한다.
3. 만약, 맨 처음 들어와있는 수가, 삽입할 요소보다 작으면, 맨처음의 요소를 pop을 시킨다.
4. 
5. 현제 카운트를 배열의 값에 집어 넣는다.


*/

import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        
        for(int p : prices){
            queue.add(p);
        }
        int number = 0;
        
        while (queue.peek() != null) {
            int value = queue.poll();

            answer[number] = 0;

            for (Integer integer : queue) {
                answer[number]++;
                if (value > integer) {
                    break;
                }
            }

            number++;
        }
//         Deque<int> deque = new ArrayDeque<>();
        
//         int i = 0;
//         for(int j=0;j<prices.length;j++){
//             count++;
            
            
//             deque.offerFirst(p);
//         }
        
        
        return answer;
    }
}