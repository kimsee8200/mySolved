/*직접 풀지 못함.*/
import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        int keep = number.length() - k;
        
        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            while (!stack.isEmpty() && k > 0 && stack.peek() < digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().substring(0, keep);
    }
}

// import java.util.*;

// class Solution {
//     public String solution(String number, int k) {
//         String answer = "";
//         ArrayList<String> arr = new ArrayList<>(Arrays.asList(number.split("")));
//         int count = 0;
//         int i=0;
//         while(count<=k){
//             if(i>=arr.size()-(k-1)){
//                 break;
//             }
            
//             //System.out.println(arr);
            
//             int com1 = Integer.parseInt(arr.get(i));
//             //System.out.print(com1+" ");
//             int com2 = Integer.parseInt(arr.get(i+1));
//             //System.out.print(com2+" ");
        
            
//             if(i==0&&com1>com2){
//             //System.out.println("PP");
                
//                 arr.remove(com2);
//                 count++;
//                 i++;
//                 continue;
//             } else if(i==0){
//             //System.out.println("PG");
                
//                 i++;
//                 continue;
//             }
            
//             int com3 = Integer.parseInt(arr.get(i-1));
//             //System.out.print(com3);
            
//             //System.out.println(" "+i);
//             if(com1>com2&&com1>com3){
//                 arr.remove(i+1);
//                 arr.remove(i-1);
//                 count+=2;
//             }else if(com1>com2&&com1<=com3){
//                 arr.remove(i+1);
//                 i++;
//                 count++;
//             }else if(com1<=com2&&com1>com3){
//                 arr.remove(i-1);
//                 count++;
//             }else{
//                 i++;
//             }
            
            
            
//         }
//         //System.out.print(arr);
//         String[] number1 = new String[arr.size()];
//         arr.toArray(number1);
//         return String.join("",number1);
//     }
// }

// import java.util.*;
// class Solution {
//     public String solution(String number, int k) {
//         String answer = "";
//         Long number11 = 0;
//         Long number22 = 0;
//         int count = 0;
//         ArrayList<String> arr = new ArrayList<>(Arrays.asList(number.split("")));
        
//         while(count<k){
//             ArrayList<String> arr2 = (ArrayList<String>) arr.clone();
//             ArrayList<String> arr3 = (ArrayList<String>) arr.clone();
//             arr2.remove(0);
//             arr3.remove(1);
        
//             String[] number1 = new String[arr.size()];
//             String[] number2 = new String[arr.size()];
//             arr2.toArray(number1);
//             arr3.toArray(number2);
            
//             String n1 = String.join("",number1);
//             String n2 = String.join("",number2);
            
//             number11 = Long.parseLong(n1);
//             number22 = Long.parseLong(n2);
            
//             if(number11>number22){
//                 arr = Arrays.asList(number1);
//             }else
//                 arr = Arrays.asList(number2);
//             // System.out.print(Long.parseLong("4172522841"));
//             count++;
//         }
        
//         return answer;
//     }
// }

// import java.util.*;
// class Solution {
//     public String solution(String number, int k) {
//         String answer = "";
//         int count = 0;
//         int i=0;
//          ArrayList<Integer> arr= new ArrayList<>();
//         for(String num : number.split("")){
//             arr.add(Integer.parseInt(num));
//         }
        
//         while(count<k){
//             ArrayList<Integer> arr2 = (ArrayList<Integer>) arr.clone();
//             ArrayList<Integer> arr3 = (ArrayList<Integer>) arr.clone();
//             arr2.delete
            
            
//         }
       
//         for(Integer num : arr){
//             answer+=Integer.toString(num);
//         }
        
//         return answer;
//     }
// }