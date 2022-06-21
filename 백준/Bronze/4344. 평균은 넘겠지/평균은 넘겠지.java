import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter (new OutputStreamWriter(System.out));
        
        int c = Integer.parseInt(scan.readLine());
        double[] darr = new double[c];
        for (int i = 0; i < c; i++) {
            StringTokenizer st = new StringTokenizer(scan.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] nscore = new int[n];
            int average = 0;
            for (int j = 0; j < n; j++) {
                nscore[j] = Integer.parseInt(st.nextToken());
                average += nscore[j];
            }
            average /= n;
            for (int j = 0; j < n; j++)
                if (nscore[j] > average)
                    darr[i] += 1;
            darr[i] = darr[i] * 100 / n;
        }
        for (int i = 0; i < c; i++)
            print.write(String.format("%.3f%%\n",darr[i]));
        print.close();
        scan.close();
    }
}