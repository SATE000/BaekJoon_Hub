import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String s = scan.readLine();
            if (s.equals("0 0")) {
                break;
            }
            StringTokenizer st = new StringTokenizer(s);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (y % x == 0) {
                print.write("factor\n");
            } else if (x % y == 0) {
                print.write("multiple\n");
            } else {
                print.write("neither\n");
            }
        }

        scan.close();
        print.close();
    }

}