import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(scan.readLine());
        
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(scan.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int v = Integer.parseInt(scan.readLine());
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v) {
                count++;
            }
        }
        print.write(count+"\n");
        
        scan.close();
        print.close();
    }
    
}