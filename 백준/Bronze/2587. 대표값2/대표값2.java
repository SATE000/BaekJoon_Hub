import java.io.*;
import java.util.Arrays;

public class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int[] arr = new int[5];
        int average = 0;
        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(scan.readLine());
            average += n;
            arr[i] = n;
        }
        average /= arr.length;
        Arrays.sort(arr);
        print.write(average + "\n" + arr[2]);
        
		scan.close();
		print.close();
	}
    
}