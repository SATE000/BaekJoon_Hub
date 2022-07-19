import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static int BreakEven(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int fix = Integer.parseInt(st.nextToken());
        int variable = Integer.parseInt(st.nextToken());
        int selling = Integer.parseInt(st.nextToken());
        if (variable >= selling)
            return -1;
        int point = fix / (selling - variable);
        while (true) {
            if (fix+(variable*point) < selling * point)
                return point;
            point++;
        }
    }
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        print.write(BreakEven(scan.readLine())+"");
        
        print.close();
        scan.close();
    }
    
}