import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int x = Integer.parseInt(scan.readLine());
        int n = Integer.parseInt(scan.readLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(scan.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sum += a * b;
        }
        if (x == sum) {
            print.write("Yes\n");
        } else {
            print.write("No\n");
        }
        
        scan.close();
        print.close();
    }
    
}