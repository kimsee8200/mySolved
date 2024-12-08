class Solution {
    int sum = 0;
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        for(int i = 0; i<num; i++){

            sum += i+1;
            answer[i] = i+1;
        }
        while(sum != total){
            if(sum > total){
                sum = 0;
                for(int i = 0; i<num; i++){
                    answer[i] = answer[i]-1;
                    sum += answer[i];
                }
            }else{
                sum = 0;
                for(int i = 0; i<num; i++){
                    answer[i] = answer[i]+1;
                    sum += answer[i];
                }
            }

        }
        return answer;
    }
    
}