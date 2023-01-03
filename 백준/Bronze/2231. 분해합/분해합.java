import java.io.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(scan.readLine());
        int answer = 0;

        for (int i = 1; i < n; i++) {
            int j = i;
            int sum = i;
            while (j > 0) {
                sum += j % 10;
                j /= 10;
            }
            if (n == sum) {
                answer = i;
                break;
            }
        }

        print.write(answer + "");

        scan.close();
        print.close();
    }

}