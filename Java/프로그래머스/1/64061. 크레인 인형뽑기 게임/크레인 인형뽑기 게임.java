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
        for(int move:moves){
            
            move--;
            //System.out.println(move+"__");
            int i=0;
            if(board[board[move].length-1][move]==0){
                continue;
            }
            // for(int[] b : board){
            //     for(int c : b)
            //         System.out.print(c+" ");
            //     System.out.print("\n");
            // }
            while(true){
                //System.out.println(i);
                //System.out.println(board[i][move]);
                if(board[i][move]!=0){
                    break;
                }
                i++;
            }
            
            
            if(!s.empty()&&s.peek()==board[i][move]){
                //System.out.println("dfe");
                s.pop();
                board[i][move] = 0;
                //System.out.println(s);
                answer=answer+2;
            }else{
                //System.out.println(board[i][move]+"_");
                s.push(board[i][move]);
                board[i][move]=0;
                //System.out.println(s);
            }
        }
        return answer;
    }
}