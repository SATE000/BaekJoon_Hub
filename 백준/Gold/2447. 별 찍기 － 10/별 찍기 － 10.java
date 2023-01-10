import java.io.*;
import java.util.*;

public class Main {

    public static char [][] arr;

    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(scan.readLine());
        arr = new char[n][n];
        printring(0, 0, n, false);

        for (int i = 0; i < n; i++) {
            print.write(arr[i]);
            print.write("\n");
        }

        scan.close();
        print.close();
    }

    public static void printring (int x, int y, int n, boolean b) {
        if (b) {
            for (int i = x; i < x + n; i++) {
                for (int j = y; j < y + n; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if (n == 1) {
            arr[x][y] = '*';
            return;
        }

        int k = n/3;
        int count = 0;
        for (int i = x; i < x + n; i += k) {
            for (int j = y; j < y + n; j += k) {
                count++;
                if (count == 5) {
                    printring(i, j, k, true);
                }
                else {
                    printring(i, j, k, false);
                }
            }
        }
    }

}