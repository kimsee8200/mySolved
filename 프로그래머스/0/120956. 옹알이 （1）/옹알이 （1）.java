class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String baba:babbling){
            baba=baba.replace("aya"," ");
            baba=baba.replace("woo"," ");
            baba=baba.replace("ye"," ");
            baba=baba.replace("ma"," ");
            baba=baba.replace(" ","");
            if(baba.length()==0){
                answer++;
            }
            System.out.println(baba);
        }
        return answer;
    }
}