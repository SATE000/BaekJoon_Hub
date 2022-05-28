import java.util.StringTokenizer;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            try {
                StringTokenizer st = new StringTokenizer(scan.readLine());
                print.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
            } catch (Exception e) {
                break;
            }
        }
        scan.close();
        print.flush();
        print.close();
    }
}