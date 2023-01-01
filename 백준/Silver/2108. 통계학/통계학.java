import java.io.*;
import java.util.*;

public class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int n = Integer.parseInt(scan.readLine());
        int[] arr = new int[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(scan.readLine());
            arr[i] = k;
            sum += k;
        }
        Arrays.sort(arr);
        
        int min = arr[0];
        double ave = sum / n;
        int first = (int) Math.round(ave);
        int second = arr[n / 2];
        int fourth = arr[n - 1] - min;
        
        boolean b = false;
        int max = -1;
        int[] x = new int[fourth + 1];
        for (int i = 0; i < n; i++) {
            int k = arr[i] - min;
            x[k]++;
        }
        
        int third = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                b = false;
                third = i + min;
                max = x[i];
            } else if (x[i] == max && !b) {
                b = true;
                third = i + min;
            }
        }
        
        print.write(first + "\n" + second + "\n" + third + "\n" + fourth);
        
		scan.close();
		print.close();
	}
    
}