import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(scan.readLine());
        for (int i = 1; i < num + 1; i++) {
            StringTokenizer st = new StringTokenizer(scan.readLine());
            print.write("Case #" + i + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        print.flush();
        print.close();
    }
}