import java.util.StringTokenizer;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(scan.readLine());
        for (int i = 1; i < num+1; i++) {
            for (int j = num; j > i; j--) {
                print.write(" ");
            }
            for (int j = 0; j < i;  j++) {
                print.write("*");
            }
            print.write("\n");
        }
        print.flush();
        print.close();
    }
}