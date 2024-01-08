class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] array = my_string.split("");
        for(int i=my_string.length()-1;i>=0;i--){
            answer+=array[i];
        }
        return answer;
    }
}