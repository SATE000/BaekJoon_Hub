import java.io.*;

public class Main {
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(scan.readLine());
        int answer = 1;
        for (int i = 1; i < n+1; i++)
            answer *= i;
        print.write(answer+"");
        
        print.close();
        scan.close();
    }
    
}