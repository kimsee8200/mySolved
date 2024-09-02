import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        int repeat = Integer.parseInt(br.readLine());
        int foot;

        for(int i = 0; i < repeat; i++){
            deque.add(i+1);
        }

        while(deque.size() > 1){
            deque.removeFirst();
            foot = deque.removeFirst();
            deque.addLast(foot);
        }

        System.out.println(deque.removeFirst());
    }
}
