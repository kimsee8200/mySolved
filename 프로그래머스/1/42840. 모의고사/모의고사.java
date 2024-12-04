//1. 1, 2, 3, 4, 5
//2. 2, 1, 2, 3, 2, 4, 2, 5
//3. 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
import java.util.*;
class Solution {
    public Integer[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[][] checkList = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        int[] carry = new int[3];
        
        
        for(int i = 0; i < checkList.length; i++){
            for(int j = 0; j < answers.length; j++){
                if(answers[j] == checkList[i][j%checkList[i].length]){
                    carry[i]++;
                }
            }
        }
        
        int max = carry[0];
        answer.add(1);
        // 최댓값을 구해 인덱스를 구하기.
        for(int i = 1; i < carry.length; i++){
            if(max < carry[i]){
                max = carry[i];
                answer = new ArrayList<>();
                answer.add(i+1);
            }
            else if(max == carry[i]){
                answer.add(i+1);
            }
            
        }
        int answerSize = answer.size();
        Integer[] arrayAnswer = answer.toArray(new Integer[answerSize]);
        return arrayAnswer;
    }
}