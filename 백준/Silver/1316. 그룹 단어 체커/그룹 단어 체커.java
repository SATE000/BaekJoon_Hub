import java.io.*;

public class Main {
    
    public static boolean Group_Word (String s) {
        if (s.length() < 3) return true;
        else {
            boolean[] arr = new boolean[26];
            char post = '!';
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (post != c && arr[(int)(c-'a')])
                    return false;
                else {
                    post = c;
                    arr[(int)(c-'a')] = true;
                }
            }
            return true;
        }
    }
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(scan.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = scan.readLine();
            if (Group_Word(s)) count++;
        }
        print.write(count + "");
        
        scan.close();
        print.close();
    }
    
}