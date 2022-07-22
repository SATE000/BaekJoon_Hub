import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static boolean Prime (int n) {
        if (n == 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(scan.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        for (int i = m; i <= n; i++)
            if (Prime(i)) print.write(i+"\n");
        
        print.close();
        scan.close();
    }
    
}