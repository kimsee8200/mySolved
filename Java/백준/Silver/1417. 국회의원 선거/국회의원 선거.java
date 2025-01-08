import java.util.*;
import java.io.*;

// 1. 가장 지지자 수가 많은 곳의 표를 뺏는다.
//  -> 정렬 후, 빼기.
// 2. 만약 자신의 수가 가장 크다면 멈춘다.
public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()) - 1;
		int me = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < N; i++) {
			pq.add(Integer.parseInt(br.readLine()));
		}

		int count = 0;
		while (!pq.isEmpty() && pq.peek() >= me) {		
			++me;
			pq.add(pq.poll() - 1);
			++count;
		}

		System.out.println(count);
    }
}
