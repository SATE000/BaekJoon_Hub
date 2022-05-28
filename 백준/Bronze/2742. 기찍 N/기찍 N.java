import java.util.StringTokenizer;
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = Integer.parseInt(scan.readLine()); i > 0; i--)
            print.write(i + "\n");
        print.flush();
        print.close();
    }
}