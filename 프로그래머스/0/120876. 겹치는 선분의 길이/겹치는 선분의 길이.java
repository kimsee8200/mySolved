import java.util.*;


class Solution {
    public int solution(int[][] lines) {
//         int answer = 0;
//         Arrays.sort(lines, (o1,o2)->{
//             return o1[0]-o2[0];
//         });
        
//         System.out.print(Arrays.deepToString(lines));
//         for(int i = 0; i<2; i++){
            
//             if(lines[i][0]<lines[i+1][0]
//                &&lines[i][1]<lines[i+1][1]
//                &&lines[i][1]>lines[i+1][0]){
                
//                 answer+=lines[i][1]-lines[i+1][0];
//             }else if(lines[i][0]<lines[i+1][0]
//                      &&lines[i][1]>lines[i+1][1]
//                      &&lines[i][1]>lines[i+1][0]){
                
//                 answer+=lines[i+1][1]-lines[i+1][0];
//             }else if(lines[i][0]>lines[i+1][0]
//                      &&lines[i][1]>lines[i+1][1]
//                      &&lines[i][1]>lines[i+1][0]){
                
//                 answer+=lines[i+1][1]-lines[i][0];
//             }else if(lines[i][0]>lines[i+1][0]
//                      &&lines[i][1]<lines[i+1][1]
//                      &&lines[i][1]>lines[i+1][0]){
                
//                 answer+=lines[i][1]-lines[i][1];
//             }else if(lines[i][0]==lines[i+1][0]&&lines[i][1]==lines[i+1][1]){
//                  answer+=lines[i][1]-lines[i][0];
//             }else if(lines[i][0]==lines[i+1][0]&&lines[i][1]<=lines[i+1][1]){
//                  answer+=lines[i][1]-lines[i][0];
//             }else if(lines[i][0]==lines[i+1][0]&&lines[i][1]>=lines[i+1][1]){
//                  answer+=lines[i][1]-lines[i+1][0];
//             }
            
//         }
        
//         if(lines[0][1]>lines[1][0]&&lines[0][1]>lines[2][0]){
//             System.out.print("in");
//             if(){
//                 -lines[1][0]
//             }
//         }
        // 나중에 다시 풀어보기
       int[] count = new int[201];
        for(int i=0; i<3; i++) {
            for(int j=lines[i][0]+100; j<lines[i][1]+100; j++) {
                count[j]++;
            }
        }
        
        int answer = 0;
        for(int i=0; i<count.length; i++) {
            if(count[i] > 1) {
                answer++;
            }
        }
        return answer;
    }
}