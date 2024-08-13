import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder str = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());
        int M = 5;
        int[][] arr = new int[N][M];

        for (int n = 0; n < N; n++){
            st = new StringTokenizer(br.readLine());
            for(int m = 0; m < M; m++)
                arr[n][m] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        int num = 0;
       
        for(int t = 0; t < N; t++){
            HashSet<Integer> set = new HashSet<>();
     
            for(int m = 0; m < M; m++){
                for(int n =0; n < N; n++){
                   
                    if(n == t)
                        continue;
               
                    if(arr[t][m] == arr[n][m])
                        set.add(n);
                }
            }
            if(num < set.size()){
                result = t;
                num = set.size();
            }
        }

        str.append(result+1);

        System.out.print(str);
        br.close();
    }
}
