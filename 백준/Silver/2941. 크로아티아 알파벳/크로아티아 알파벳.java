import java.io.*;

public class Main {
    
    public static int Croatia (String s) {
        int count = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') count--;
            else if (s.charAt(i) == 'j' && i > 0) {
                if (s.charAt(i-1) == 'l' || s.charAt(i-1) == 'n') count--;
            }
            else if (s.charAt(i) == '=') {
                if (s.charAt(i-1) == 'z' && i > 1) {
                    if (s.charAt(i-2) == 'd') count -= 2;
                    else count--;
                } else count--;
            }
        }
        return count;
    }
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = scan.readLine();
        print.write(Croatia(s)+"\n");
        
        print.close();
        scan.close();
    }
    
}