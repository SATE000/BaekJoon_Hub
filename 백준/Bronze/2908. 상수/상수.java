import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(scan.readLine());
        int a = Integer.parseInt(st.nextToken());
        a = ((a%10)*100)+(((a%100)/10)*10)+(a/100);
        int b = Integer.parseInt(st.nextToken());
        b = ((b%10)*100)+(((b%100)/10)*10)+(b/100);
        int answer;
        if (a > b) answer = a;
        else answer = b;
        print.write(answer+"\n");
    
        print.close();
        scan.close();
    }
    
}