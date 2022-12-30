import java.io.*;
import java.util.*;

public class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
		
        StringTokenizer st1 = new StringTokenizer(scan.readLine());
        StringTokenizer st2 = new StringTokenizer(scan.readLine());
        
        int n = Integer.parseInt(st1.nextToken());
        int k = Integer.parseInt(st1.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(arr);
        print.write(arr[n - k] + "");
		scan.close();
		print.close();
	}
    
}