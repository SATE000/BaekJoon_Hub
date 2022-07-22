import java.io.*;

public class Main {
    
    public static boolean Prime (int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int itry = Integer.parseInt(scan.readLine());
        for (int i = 0; i < itry; i++) {
            int n = Integer.parseInt(scan.readLine());
            for (int j = n/2; j > 0; j--)
                if (Prime(j) && Prime(n-j)) {
                    print.write(j + " " + (n-j)+"\n");
                    break;
                }
        }
        
        print.close();
        scan.close();
    }
    
}