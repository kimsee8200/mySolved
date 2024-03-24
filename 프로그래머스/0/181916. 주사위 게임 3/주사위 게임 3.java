import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] count = {a,b,c,d};
        if(a==b&&b==c&&c==d){
            System.out.print("1");
            answer = a*1111;
        }else if(a!=b&&b!=c&&c!=d&&a!=d&&a!=c&&b!=d){
            System.out.print("2");
            answer = Math.min(a,b);
            answer = Math.min(answer,c);
            answer = Math.min(answer,d);
        }
       else if((a==b&&c==d)||(a==c&&b==d)||(b==c&&a==d)){
            System.out.print("3");
           
            count = Arrays.stream(count).distinct().toArray();
           answer = (count[0]+count[1])*Math.abs(count[0]-count[1]);
        }else if(((a==b&&c!=d)||(a==c&&b!=d)||(a==d&&b!=c)||(b==c&&a!=d)||(b==d&&a!=c)||(c==d&&a!=b))&&Arrays.stream(count).distinct().toArray().length!=2){
            System.out.print("4");
             if(a==b){
               answer = c*d;
           }else if(a==c){
               answer = b*d;
               
           }else if(a==d){
               answer = b*c;
               
           }else if(b==c){
               answer = a*d;
               
           }else if(b==d){
               answer = a*c;
               
           }else if(c==d){
               answer = a*b;
           }
        }else{
            System.out.print("5");
           
           int ch=count[0];
           int cot=0;
           for(int i=1;i<count.length;i++){
               if(ch==count[i]){
                   cot++;
               }
           }
           count = Arrays.stream(count).distinct().toArray();
           if(cot==2)answer = (int)Math.pow(10*count[0]+count[1],2);
           else answer = (int)Math.pow(10*count[1]+count[0],2);
        }
        return answer;
    }
}