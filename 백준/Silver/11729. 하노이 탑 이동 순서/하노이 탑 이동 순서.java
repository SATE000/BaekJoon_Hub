import java.io.*;

public class Main {

    static BufferedReader scan;
    static BufferedWriter print;

    public static void main (String[] args) throws IOException {
        scan = new BufferedReader(new InputStreamReader(System.in));
        print = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(scan.readLine());
        int k = (int) Math.pow(2, n) - 1;
        print.write(k + "\n");
        printing(n, 1, 2, 3);

        scan.close();
        print.close();
    }

    static void printing (int n, int first, int second, int third) throws IOException {
        if (n == 1) {
            print.write(first + " " + third + "\n");
            return;
        }

        printing(n-1, first, third, second);
        print.write(first + " " + third + "\n");
        printing(n - 1, second, first, third);
    }

}