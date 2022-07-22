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
        
        while (true) {
            int i = Integer.parseInt(scan.readLine());
            if (i == 0) break;
            int count = 0;
            for (int j = i+1; j <= i * 2; j++)
                if (Prime(j)) count++;
            print.write(count+"\n");
        }
        
        print.close();
        scan.close();
    }
    
}