import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());

        int[] value = new int[N+1];
        int[] result = new int[K];
        stringTokenizer = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            value[i] = Integer.parseInt(stringTokenizer.nextToken());
            if (i>1){
                value[i] = value[i]+value[i-1];
            }
        }
        
        for (int i = 0; i < K; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());

            result[i] = value[b]-value[a-1];
        }
        
        for (int i = 0; i < K; i++) {
            System.out.println(result[i]);
        }
    }
}
