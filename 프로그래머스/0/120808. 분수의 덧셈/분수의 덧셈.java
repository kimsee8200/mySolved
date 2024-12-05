import java.util.*;
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        
        answer[0] = (numer1*denom2)+(numer2*denom1);
        answer[1] = denom1*denom2;
        
        int GCDVal = GCD(answer);
        answer[0] = answer[0]/GCDVal;
        answer[1] = answer[1]/GCDVal;
        return answer;
    }
    
    public int GCD(int[] answer){
        int front = answer[0];
        int rear = answer[1];
        int carry = 0;
        
        while(front%rear!=0){
            carry = front;
            front = rear;
            rear = carry%rear;
        }
        
        return rear;
    }
    
 
}