import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st1 = new StringTokenizer(scan.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        int[][] arr = new int[n][m];
        
        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < arr.length; i++) {
                StringTokenizer st2 = new StringTokenizer(scan.readLine());
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] += Integer.parseInt(st2.nextToken());
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                print.write(arr[i][j] + " ");
            }
            print.write("\n");
        }
        
        scan.close();
        print.close();
    }
    
}