import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static String Word (String s) {
        StringTokenizer st = new StringTokenizer(s);
        String reverse = "";
        while (st.hasMoreTokens()) {
            String sToken = st.nextToken();
            for (int i = sToken.length()-1; i >= 0; i--)
                reverse += sToken.charAt(i);
            reverse += " ";
        }
        return reverse;
    }
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(scan.readLine());
        for (int i = 0; i < n; i++)
            print.write(Word(scan.readLine())+"\n");
        
        print.close();
        scan.close();
    }
    
}