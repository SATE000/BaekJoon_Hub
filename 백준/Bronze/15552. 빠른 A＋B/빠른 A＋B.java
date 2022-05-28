import java.util.StringTokenizer;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        int itry = Integer.parseInt(scan.readLine());
        
        for (int i = 0; i  < itry; i++) {
            StringTokenizer st = new StringTokenizer(scan.readLine());
            
            print.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())) + "\n");
        }
        
        print.flush();
        print.close();
        
    }
}