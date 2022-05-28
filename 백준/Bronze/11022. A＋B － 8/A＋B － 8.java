import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(scan.readLine());
        for (int i = 1; i < num+1; i++) {
            StringTokenizer st = new StringTokenizer(scan.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            print.write("Case #" + i + ": " + a + " + " + b + " = " + (a+b) + "\n");
        }
        print.flush();
        print.close();
    }
}