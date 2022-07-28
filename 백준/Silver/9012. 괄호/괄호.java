import java.io.*;

public class Main {
    
    public static String Bracket (String s) {
        String result = "NO";
        int nVPS = 0;
        for (int i = 0; i < s.length(); i++) {
            if (nVPS == 0 && s.charAt(i) == ')') {
                nVPS = -1;
                break;
            }
            else if (s.charAt(i) == '(') nVPS++;
            else if (s.charAt(i) == ')')nVPS--;
        }
        if (nVPS == 0) result = "YES";
        return result;
    }
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(scan.readLine());
        for (int i = 0; i < n; i++)
            print.write(Bracket(scan.readLine())+"\n");
        
        print.close();
        scan.close();
    }
    
}