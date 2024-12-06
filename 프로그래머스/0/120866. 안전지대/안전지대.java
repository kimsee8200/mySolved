// 위험지대는 board[n-1][n-1],board[n-1][n],board[n-1][n+1]
        // board[n+1][n-1],board[n+1][n],board[n+1][n+1]
        // board[n][n],board[n][n] <- 폭탄,board[n][n+1]

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
//         for(int i=0; i<board.length; i++){
//             for(int j=0; j<board[i].length; j++){
//                 answer++;
//                 if(board[i][j] == 1){
//                     answer+=returnDangerArea(board, i,j);
//                 }
                
//             }
//         } 나중에 계속 이 방식으로 풀어보기.
        
        int[][] list = new int[board.length+2][board.length+2];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j] == 1){
                    for(int a=i;a<=i+2;a++){
                        for(int b=j;b<=j+2;b++){
                            if(list[a][b] != 1){
                                list[a][b] = 2;
                            }
                        }
                    }
                }
            }
        }
        for(int i = 1;i<list.length-1;i++){
            for(int j = 1;j<list.length-1;j++){
                if(list[i][j] == 0){
                    answer++;
                }
            }
        }
        return answer;
        
    }
    
//     public int returnDangerArea(int[][] board, int i, int j){
//         int answer = -9;
        
//         // 끝 부분 해결
//         if(i == board.length-1||i == 0){ //i가 끝 부분일때
//             answer += 3;
//         }
                
        
//         if(i==j && (j == 0 || j == board.length-1)){ // j와 i 모두 끝 부분일때
//             answer += 2;
//         }else if(j == 0 || j == board.length-1){ // j가 끝 부분일때
//             answer += 3;
//         }
        
//         //폭탄이 겹치는 경우.
//         if(i!=j && i!=0 && j!=0 && i!=board.length-1&&j != board.length-1){
//             if(board[i-1][j-1]==1||board[i-1][j+1]==1){
//                 System.out.println("in part3");
//                 answer+=3;
//             }else if(board[i][j-1]==1||board[i-1][j]==1){
//                 System.out.println("in part3 else");
//                 answer+=6;
//             }
//         }
        
//         System.out.println(answer);
        
//         // 폭탄이 겹쳐있지 않으나, 위험지대애 겹칠 경우.
//         return answer;
//     }
}