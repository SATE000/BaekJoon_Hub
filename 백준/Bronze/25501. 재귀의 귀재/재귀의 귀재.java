import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(scan.readLine());

        for (int i = 0; i < n; i++) {
            String s = scan.readLine();
            print.write(isPalindrome(s) + "\n");
        }

        scan.close();
        print.close();
    }

    public static String recursion (String s, int l, int r) {
        if (l >= r) {
            return 1 + " " + (l+1);
        } else if (s.charAt(l) != s.charAt(r)) {
            return 0 + " " + (l+1);
        } else {
            return recursion(s, l+1, r-1);
        }
    }

    public static String isPalindrome (String s) {
        return recursion(s, 0, s.length()-1);
    }

}