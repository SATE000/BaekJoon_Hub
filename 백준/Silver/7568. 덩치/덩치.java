import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(scan.readLine());
        int[][] arr = new int[n][2];
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(scan.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            answer[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    answer[i]++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            print.write(answer[i] + " ");
        }

        scan.close();
        print.close();
    }

}