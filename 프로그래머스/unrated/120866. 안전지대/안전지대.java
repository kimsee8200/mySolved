class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int l = board.length;
        int[][] nb = new int[l+2][l+2];

        for(int x = 0; x < l; x++){
            for(int y = 0; y < l; y++){
                if(board[y][x] == 1){                    
                    nb[y+1][x+1] = 1; 
                    System.out.println(x + " || " + y);
                }
            }
        }

        for(int y = 0; y < l; y++){
            for(int x = 0; x < l; x++){
                if(board[y][x] == 1){                    
                    nb[y][x] = 1;
                    nb[y][x+1] = 1;
                    nb[y][x+2] = 1;

                    nb[y+1][x] = 1;
                    nb[y+1][x+1] = 1;
                    nb[y+1][x+2] = 1;

                    nb[y+2][x] = 1;
                    nb[y+2][x+1] = 1;
                    nb[y+2][x+2] = 1;
                }
            }
        }



        for(int y = 1; y < l+1; y++){
            for(int x = 1; x < l+1; x++){
                if(nb[y][x] == 0){
                    answer++;
                }
            }
        }

        return answer;
    }
}