import java.io.*;
import java.util.*;

public class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int n = Integer.parseInt(scan.readLine());
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scan.readLine());
        }
        Arrays.sort(arr);
        
        for (int i = 0; i < n; i++) {
            print.write(arr[i] + "\n");
        }
        
		scan.close();
		print.close();
	}
    
}