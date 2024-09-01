import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String readNum = br.readLine();
        String num = br.readLine();
        br.close();

        Stack<Integer> stack = new Stack();
        ArrayList<Integer> numList = new ArrayList<>();
        for (String n: num.split(" ")) {
            numList.add(Integer.parseInt(n));
        }
        int last = Integer.parseInt(readNum);
        int flag = 1;
        int tmp = 0;

        while(!numList.isEmpty()){
               tmp = numList.get(0);
               numList.remove(0);
                if(tmp == flag){
                    flag++;
                } else {
                    stack.push(tmp);
                }
            if(!stack.isEmpty()) {
                while (stack.peek() == flag) {
                    stack.pop();
                    flag++;
                    if (stack.isEmpty()) {
                        break;
                    }
                }
            }
        }


        System.out.println(stack.isEmpty() ? "Nice" : "Sad");
    }
}
