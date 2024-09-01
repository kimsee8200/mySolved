import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        List<String> templist = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        int repeat = Integer.parseInt(br.readLine());
        for(int i = 0; i < repeat; i++){
            list.add(br.readLine());
        }
        int i = 0;
        String[] prints = new String[repeat];
        for(String element : list){
            templist = List.of(element.split(""));
            for (String temp : templist){
                if(stack.isEmpty()){
                    stack.push(temp);
                }else if(temp.equals(")")&&stack.peek().equals("(")){
                    stack.pop();
                }else {
                    stack.push(temp);
                }
            }
            prints[i] = stack.isEmpty()? "YES" : "NO";
            stack.clear();
            i++;
        }
        for(String element : prints){
            System.out.println(element);
        }
    }
}
