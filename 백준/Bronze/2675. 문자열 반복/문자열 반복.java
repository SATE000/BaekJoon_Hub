import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int itry = Integer.parseInt(scan.readLine());
        for (int i = 0; i < itry; i++) {
            StringTokenizer st = new StringTokenizer(scan.readLine());
            int nRetry = Integer.parseInt(st.nextToken());
            String sRetry = st.nextToken();
            for (int nIndex = 0; nIndex < sRetry.length(); nIndex++) {
                char c = sRetry.charAt(nIndex);
                for (int j = 0; j < nRetry; j++)
                    print.write(c+"");
            }
            print.write("\n");
        }
        
        print.close();
        scan.close();
    }
}