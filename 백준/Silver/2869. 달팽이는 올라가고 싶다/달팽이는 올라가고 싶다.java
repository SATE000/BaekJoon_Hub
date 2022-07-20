import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(scan.readLine());
        int day = Integer.parseInt(st.nextToken());
        int night = Integer.parseInt(st.nextToken());
        int wood = Integer.parseInt(st.nextToken());
        int days = (wood - day) / (day - night);
        int now = (day - night) * days;
        while (true) {
            days++;
            now += day;
            if (now >= wood) break;
            now -= night;
        }
        print.write(days+"");

        print.close();
        scan.close();
    }
    
}