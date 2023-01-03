import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(scan.readLine());
        StringTokenizer st2 = new StringTokenizer(scan.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int k = Integer.parseInt(st1.nextToken());

        int[] arr = new int[n];
        int max = 0;

        for (int i =0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1 ; j++) {
                for (int t = j + 1; t < n; t++) {
                    int sum = arr[i] + arr[j] + arr[t];
                    if (sum > max && sum <= k) {
                        max = sum;
                    }
                }
            }
        }

        print.write(max + "");

        scan.close();
        print.close();
    }

}