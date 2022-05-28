import java.util.StringTokenizer;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(scan.readLine());
        int nTry = Integer.parseInt(st1.nextToken());
        int standard = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(scan.readLine());
        for (int i = 0; i < nTry; i++) {
            int a = Integer.parseInt(st2.nextToken());
            if (standard > a)
                print.write(a + " ");
        }
        print.flush();
        print.close();
        scan.close();
    }
}