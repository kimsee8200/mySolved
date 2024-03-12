class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int count = 1;
        
        
        int i=0;
        int j=0;
        int b=0;
        while(count<=(n*n)){
            count++;
            answer[i][j]=count;
            System.out.print(i);
           System.out.println(j);
            if(i==b&&j<n-(b+1)){
                j++;
            }else if((j==n-(b+1)&&i<n-(b+1))){
                i++;
            }else if(i==n-(b+1)&&j>b){
                j--;
                if(j==b){
                    b++;
                }
            }else if(j==b&&i>b){
                i--;
            }
            
        }
        return answer;
    }
}