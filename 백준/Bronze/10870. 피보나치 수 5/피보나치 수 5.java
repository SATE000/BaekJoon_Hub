import java.io.*;

public class Main {
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(scan.readLine());
        int[] arr = new int[n+2];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length-1; i++)
            arr[i] = arr[i-1] + arr[i-2];
        print.write(arr[n]+"");
        
        print.close();
        scan.close();
    }
    
}