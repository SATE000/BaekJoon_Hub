import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int Prime (String s, int i) {
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            if ((n % 2 == 0 && n != 2) || n == 1) i--;
            else {
                for (int j = 3; j < n; j += 2) {
                    if (n % j == 0) {
                        i--;
                        break;
                    }
                }
            }
        }
        return i;
    }
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int i = Integer.parseInt(scan.readLine());
        print.write(Prime(scan.readLine(),i)+"");
        
        print.close();
        scan.close();
    }
    
}