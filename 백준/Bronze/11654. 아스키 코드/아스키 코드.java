import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String sAlpha = scan.readLine();
        char Alpha = sAlpha.charAt(0);
        print.write((int)Alpha+"\n");
        
        scan.close();
        print.close();
    }
}