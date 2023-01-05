import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(scan.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = scan.readLine();
            map.put(s, i+1);
        }

        int answer = 0;
        for (int i = 0; i < m; i++) {
            if (map.containsKey(scan.readLine())) {
                answer++;
            }
        }

        print.write(answer + "");

        scan.close();
        print.close();
    }

}