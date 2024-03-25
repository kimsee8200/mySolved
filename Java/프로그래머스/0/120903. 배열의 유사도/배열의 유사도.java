class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String word:s1){
            for(String word2:s2){
                if(word.equals(word2))
                    answer++;
            }
        }
        return answer;
    }
}