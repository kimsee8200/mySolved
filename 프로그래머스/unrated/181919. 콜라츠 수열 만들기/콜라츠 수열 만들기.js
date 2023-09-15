function solution(n) {
    var answer = [];
    var i=1;
    answer[0]=n;
    while(n!=1){
      if(n%2==0){
          answer[i]=n/2;
          n=answer[i];
      }  
        else{
            answer[i]=3*n+1;
            n=answer[i];
        }
        i++;
    }
    return answer;
}