import java.io.*;

public class Main {
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = scan.readLine().toUpperCase();
        
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) arr[s.charAt(i) - 65]++;
        int max = 0;
        char c = '?';
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                c = (char)(i+65);
            }
            else if (arr[i] == max && max != 0) {
                c = '?';
            }
        }
        
        print.write(c);
        
        print.close();
        scan.close();
    }
    
}