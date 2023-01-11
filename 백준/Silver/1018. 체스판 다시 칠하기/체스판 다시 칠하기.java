import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(scan.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean[][] chess = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String s = scan.readLine();
            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == 'B') {
                    chess[i][j] = true;
                } else {
                    chess[i][j] = false;
                }
            }
        }

        int answer = 64;

        for (int x = 0; x < n - 7; x++) {
            for (int y = 0; y < m - 7; y++) {
                boolean start = chess[x][y];
                int count = 0;
                for (int i = x; i < x + 8; i++) {
                    for (int j = y; j < y + 8; j++) {
                        if (chess[i][j] != start) {
                            count++;
                        }
                        start = !start;
                    }
                    start =! start;
                }
                count = Math.min(count, 64 - count);
                answer = Math.min(answer, count);
                count = 0;
            }
        }

        print.write(answer + "");

        scan.close();
        print.close();
    }

}