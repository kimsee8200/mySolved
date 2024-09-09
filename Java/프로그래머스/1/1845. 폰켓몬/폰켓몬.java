import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        for(Integer count:nums){
            hashmap.put(count,1);
        }
        if(hashmap.size() > nums.length/2){
            answer = nums.length/2;
        }else{
            answer = hashmap.size();
        }
        
        return answer;
    }
}