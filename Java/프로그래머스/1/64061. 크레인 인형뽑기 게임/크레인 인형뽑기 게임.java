import java.util.*;
/* 
1. moves - 1칸 의 board 열에 맞춘다.
2. 요소가 없으면, 행의 칸을 내리고, 있다면, 멈추고, 
    값을 스택에 넣고 해당 인덱스 값을 0으로 바꾼다. 
3. 만약 스텍의 peek 값과, 스택에 넣으려는 값이 같으면, answer++, 

이 행위를 moves의 길이 만큼 반복한다.

*/
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> s = new Stack<>();
        
        //moves의 길이 만큼 반복.
        for(int move:moves){
            move--; // 인덱스는 0부터 시작.
            int i=0;
            
            // 맨 끝이 0인지 판단. -> 그럼 모든 요소가 0
            if(board[board[move].length-1][move]==0){ // 어차피 n*n 길이는 동일.
                continue;
            }
          
            // 크레인을 내림. -> 요소가 있는 곳 까지 행을 내림.
            while(true){
                if(board[i][move]!=0){
                    break;
                }
                i++;
            }
            
            // 만약 스텍이 비어있지 않고, 스택의 peek과 뽑은 요소가 동일하다면,
            // pop -> 0으로 바꿈.
            if(!s.empty()&&s.peek()==board[i][move]){
                s.pop();
                board[i][move] = 0;
    
                answer=answer+2;
            }else{ // 아니면 요소를 집어넣고 0으로 바꿈.
                s.push(board[i][move]);
                board[i][move]=0;
            }
        }
        
        return answer;
    }
}