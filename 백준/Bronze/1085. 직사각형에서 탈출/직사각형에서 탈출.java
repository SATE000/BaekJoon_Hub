import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(scan.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int weight = x < w - x ? x : w - x;
        int height = y < h - y ? y : h - y;

        if (weight < height) {
            print.write(weight + "");
        } else {
            print.write(height + "");
        }

        scan.close();
        print.close();
    }

}