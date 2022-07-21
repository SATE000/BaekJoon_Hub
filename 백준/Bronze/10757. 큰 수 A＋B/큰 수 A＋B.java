import java.io.*;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main {
    
    public static String Big(String s) {
        StringTokenizer st = new StringTokenizer(s);
        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());
        return a.add(b)+"";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        print.write(Big(scan.readLine()));
        
        print.close();
        scan.close();
    }
    
}