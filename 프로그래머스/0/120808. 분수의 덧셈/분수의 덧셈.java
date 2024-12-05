import java.util.*;
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        // 만약 분모 두개를 나누어 나머지가 0이면서, 앞쪽 분모가 더 클 경우.
        if(denom1%denom2==0){
            answer[0] = (numer2*denom1/denom2) + numer1;
            answer[1] = denom1;
        }else if(denom2%denom1==0){
            answer[0] = (numer1*denom2/denom1) + numer2;
            answer[1] = denom2;
        }else if(denom1==denom2){
            answer[0] = numer1 + numer2;
            answer[1] = denom1;
        }else{
            answer[0] = (numer1*denom2)+(numer2*denom1);
            answer[1] = denom1*denom2;
        }
        
        int front = answer[0];
        int rear = answer[1];
        int carry = 0;
        
        while(front%rear!=0){
            carry = front;
            front = rear;
            rear = carry%rear;
        }
        answer[0] = answer[0]/rear;
        answer[1] = answer[1]/rear;
        return answer;
    }
    
 
}