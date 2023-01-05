import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(scan.readLine());
        Map<Integer, Integer> map = new HashMap();
        StringTokenizer st1 = new StringTokenizer(scan.readLine());
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(st1.nextToken());
            map.put(k, i);
        }

        int m = Integer.parseInt(scan.readLine());
        StringTokenizer st2 = new StringTokenizer(scan.readLine());
        for (int i = 0; i < m; i++) {
            int k = map.containsKey(Integer.parseInt(st2.nextToken()))?1:0;
            print.write(k + " ");
        }

        scan.close();
        print.close();
    }

}