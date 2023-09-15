function solution(numbers) {
    var answer = 0;
    for(let i=0;i<numbers.length;i++){
        for(let j=0;j<numbers.length;j++){
            if(numbers[i]*numbers[j]>=answer&&numbers[i]!=numbers[j])
                answer=numbers[i]*numbers[j];
            else if(numbers[i]==1&&numbers[j]==1&&i!=j)
                answer=1;
        }
    }
    return answer;
}