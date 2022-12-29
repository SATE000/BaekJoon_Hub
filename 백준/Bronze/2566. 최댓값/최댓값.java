import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int max = -1;
        int a = 0, b = 0;
        for (int i = 1; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(scan.readLine());
            for (int j = 1; j < 10; j++) {
                int n = Integer.parseInt(st.nextToken());
                if (n > max) {
                    max = n;
                    a = i;
                    b = j;
                }
            }
        }
        
        print.write(max + "\n" + a + " " + b);
        
        scan.close();
        print.close();
    }
    
}