import java.io.*;

public class Main {
    
    public static int Sugar (int i) {
        if (i == 4 || i == 7) return -1;
        else {
            int count = 0;
            while (i > 0) {
                if (i % 5 == 0) {
                    count += i / 5;
                    break;
                } else {
                    i -= 3;
                    count++;
                }
            }
            return count;
        }
    }
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int i = Integer.parseInt(scan.readLine());
        print.write(Sugar(i)+"");
        
        print.close();
        scan.close();
    }
    
}