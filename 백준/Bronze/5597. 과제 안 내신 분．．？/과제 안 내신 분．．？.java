import java.io.*;

public class Main {
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        boolean[] arr = new boolean[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = false;
        }
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(scan.readLine()) - 1;
            arr[n] = true;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                print.write((i+1)+"\n");
            }
        }
        
        scan.close();
        print.close();
    }
    
}