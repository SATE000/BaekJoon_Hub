import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "";

        while (true) {
            s = scan.readLine();
            if (s.equals("0 0 0")) {
                break;
            }
            StringTokenizer st = new StringTokenizer(s);

            int[] arr = new int[3];
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);

            if (arr[2]*arr[2] == (arr[1]*arr[1]) + (arr[0] * arr[0])) {
                print.write("right\n");
            } else {
                print.write("wrong\n");
            }
        }

        scan.close();
        print.close();
    }

}