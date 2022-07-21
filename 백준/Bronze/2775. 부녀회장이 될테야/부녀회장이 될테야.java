import java.io.*;

public class Main {

    public static int House (int k, int n) {
        int[][] arr = new int[15][14];
        for (int i = 0; i < arr[0].length; i++)
            arr[0][i] = i+1;
        for (int i = 0; i < arr.length; i++)
            arr[i][0] = 1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        return arr[k][n-1];
    }

    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(scan.readLine());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(scan.readLine());
            int n = Integer.parseInt(scan.readLine());
            print.write(House(k,n)+"\n");
        }
        print.close();
        scan.close();
    }

}