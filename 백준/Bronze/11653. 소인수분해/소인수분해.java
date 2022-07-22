import java.io.*;

public class Main {
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(scan.readLine());
        while (n > 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    print.write(i+"\n");
                    n /= i;
                    break;
                }
            }
        }
        
        print.close();
        scan.close();
    }
    
}