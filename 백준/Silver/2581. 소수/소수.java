import java.io.*;

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
        
        int m = Integer.parseInt(scan.readLine());
        int n = Integer.parseInt(scan.readLine());
        int sum = 0, min = n;
        for (int i = m; i <= n; i++) {
            if (Prime(i)) {
                sum += i;
                if (min > i) min = i;
            }
        }
        if (sum < 1) print.write("-1");
        else print.write(sum+"\n"+min);
        
        print.close();
        scan.close();
    }
    
}