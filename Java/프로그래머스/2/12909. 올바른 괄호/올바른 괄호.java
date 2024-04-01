import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack stack = new Stack();
        char[] arr = new char[s.length()];
        arr = s.toCharArray();
        for(char c : arr){
            if(!stack.isEmpty() && ((char)stack.peek())==40&&c==41)
            {
                stack.pop();
                continue;
            }else
                stack.push(c);
        }
        return stack.isEmpty();
    }
}