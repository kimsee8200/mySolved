import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static int N;
    public static int M;
    public static boolean[][] visited;
    public static char[][] list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer1 = new StringTokenizer(br.readLine());
         N = Integer.parseInt(tokenizer1.nextToken());
         M = Integer.parseInt(tokenizer1.nextToken());

        int resultW = 0;
        int resultB = 0;
        list = new char[M][N];
        visited = new boolean[M][N];
        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                list[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i][j] == false) {
                    if(list[i][j] == 'W') {
                        resultW += (int) Math.pow(BFS(i,j),2);
                    }
                    else resultB += (int) Math.pow(BFS(i,j),2);
                }
            }
        }

        System.out.println(resultW+" "+resultB);
    }

    public static int BFS(int i, int j) {
        Queue<Integer[]> queue = new LinkedList<Integer[]>();
        queue.add(new Integer[]{i, j});
        int count = 0;
        int team = list[i][j];
        int[] xSycle = new int[]{1,-1,0,0};
        int[] ySycle = new int[]{0,0,-1,1};

        visited[i][j] = true;


        int x = 0;
        int y = 0;

        while (!queue.isEmpty()) {
            Integer[] temp = queue.poll();
            count++;
            for (int z = 0; z<4; z++) {
                x = temp[0]+xSycle[z];
                y = temp[1]+ySycle[z];
                if (x < 0 || y < 0 || x>=M || y>=N)
                    continue;
                if (list[x][y] == team && !visited[x][y]) {
                    queue.add(new Integer[]{x, y});
                    visited[x][y] = true;
                }
            }
        }
        return count;
    }
}
