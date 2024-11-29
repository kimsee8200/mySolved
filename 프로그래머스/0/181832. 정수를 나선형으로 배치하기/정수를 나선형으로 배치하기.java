class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int count = 0;
        int minuse = 0;
        int i = 0;
        int j = 0;
        int b = 0;
        while(count < n*n){
            count++;
            answer[i][j]=count;
            if(i==b&&j<n-(b+1)){
                j++;
            }else if((j==n-(b+1)&&i<n-(b+1))){
                i++;
            }else if(i==n-(b+1)&&j>b){
                j--;
            }else if(j==b&&i>b){
                i--;
            }
            if(i==b+1&&j==b){
                b++;
            }
        }
        
        return answer;
    }
}

// 나선형 배열 
// 1 2 3 4 -> 5 6 7 -> 8 9 10 -> 11 12 -> 13 14 -> 15 16
// 1 2 3 4 5 -> 6 7 8 9 -> 10 11 12 13 -> 14 15 16 -> 17 18 19 -> 20 21 -> 22 23 -> 24 -> 25