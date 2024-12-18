// 이번 달의 선물 기록을 이용하여 다음달에 누가 많이 받을지 찾아내고, 그 친구가 얼마나 선물을 받을지 구하기
// 다음달 선물을 예측하는 방법
// 1. 두 사람이 선물을 주고 받는다면, 두 사람 사이 더 많은 선물을 준 사람이 다음달에 선물을 받는다.
// 2. 두 사람이 주고받은 기록이 없거나 같으면, 선물 지수가 큰 사람이 작은 사람에게 다음달에 선물을 받는다.
// -> 선물 지수도 같다면 아무도 받지 않는다.
// -> 선물 지수 = 친구들에게 이번달 까지 준 선물의 수 - 받은 선물의 수
import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int[][] closeList = calculate(friends,gifts);
        int[][] giveList = giftCal(closeList);
        answer = resultMaker(closeList, giveList);
        return answer;
    }
    
    public int[][] calculate(String[] list,String[] gifts){
        int[][] result = new int[list.length][list.length];
        
        for(String gift : gifts){
            String[] between = gift.split(" ");
            int first = Arrays.asList(list).indexOf(between[0]);
            int second = Arrays.asList(list).indexOf(between[1]);
            result[first][second]++;
        }
        
        return result;
    }
    
    public int[][] giftCal(int[][] countList){
        int[][] result = new int[countList.length][3];
        
        for(int i = 0; i<countList.length; i++){
            for(int j = 0; j<countList.length; j++){
                result[i][0] += countList[i][j];
                result[j][1] += countList[i][j];
            }
        }
        
        for(int i=0; i<result.length; i++){
            result[i][2] = result[i][0]-result[i][1];
            System.out.println(Arrays.toString(result[i]));
            
        }
        
        return result;
    }
    
    public int resultMaker(int[][] giftList, int[][] totalList){
        int[] result = new int[giftList.length];
        int big = 0;
        for(int i = 0; i<giftList.length; i++){
            for(int j = i; j<giftList.length; j++){
                if(j==i)
                    continue;
                if(giftList[i][j]>giftList[j][i]){
                    result[i]++;
                }else if(giftList[i][j]<giftList[j][i]){
                    result[j]++;
                }else if(totalList[i][2]>totalList[j][2]){
                    result[i]++;
                }else if(totalList[i][2]<totalList[j][2]){
                    result[j]++;
                }
            }
        }
        
        for(int i = 0; i<result.length;i++){
            if(result[i]>big){
                big = result[i];
            }
        }
        
        System.out.println(Arrays.toString(result));
        
        return big;
    }
}