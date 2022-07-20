import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static int Hotel (String s) {
        StringTokenizer st = new StringTokenizer(s);
        int height = Integer.parseInt(st.nextToken());
        int width = Integer.parseInt(st.nextToken());
        int customer = Integer.parseInt(st.nextToken());
        if (customer % height == 0)
            return height * 100 + (customer / height);
        else
            return (customer % height) * 100 + (customer / height) + 1;
    }

    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(scan.readLine());
        for (int i = 0; i < n; i++)
            print.write(Hotel(scan.readLine())+"\n");
        print.close();
        scan.close();
    }

}