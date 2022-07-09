import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter (new OutputStreamWriter(System.out));
        
        int i = Integer.parseInt(scan.readLine());
        String s = scan.readLine();
        int sum = 0;
        for (int j = 0; j < i; j++) {
            char c = s.charAt(j);
            sum += c - '0';
        }
        print.write(sum+"\n");
        
        scan.close();
        print.close();
    }
}