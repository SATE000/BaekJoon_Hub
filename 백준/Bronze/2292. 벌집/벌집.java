import java.io.*;

public class Main {
    
    public static int Honeycomb (int n) {
        if (n == 1) return n;
        int i = 1, line = 1;
        while (true) {
            if (i < n && n <= i + (line*6))
                return line+1;
            i += line*6;
            line++;
        }
    }
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int i = Integer.parseInt(scan.readLine());
        print.write(Honeycomb(i) + "");
        
        print.close();
        scan.close();
    }
    
}