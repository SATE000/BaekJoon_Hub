import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(scan.readLine());
        StringTokenizer st2 = new StringTokenizer(scan.readLine());
        StringTokenizer st3 = new StringTokenizer(scan.readLine());

        int x1 = Integer.parseInt(st1.nextToken());
        int y1 = Integer.parseInt(st1.nextToken());
        int x2 = Integer.parseInt(st2.nextToken());
        int y2 = Integer.parseInt(st2.nextToken());
        int x3 = Integer.parseInt(st3.nextToken());
        int y3 = Integer.parseInt(st3.nextToken());

        int x4 = x1 == x2 ? x3 : x1 == x3 ? x2 : x1;
        int y4 = y1 == y2 ? y3 : y1 == y3 ? y2 : y1;

        print.write(x4 + " " + y4);

        scan.close();
        print.close();
    }

}