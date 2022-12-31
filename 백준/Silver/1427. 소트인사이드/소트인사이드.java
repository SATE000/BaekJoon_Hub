import java.io.*;
import java.util.*;

public class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
		
        String s = scan.readLine();
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
        Arrays.sort(arr);
        for (int i = s.length() - 1; i >= 0; i--) {
            print.write(arr[i] + "");
        }
        
		scan.close();
		print.close();
	}
    
}