import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arr = new int[10];
        int a = 10;
        for (int i = 0; i < arr.length; i++) 
            arr[i] = Integer.parseInt(scan.readLine()) % 42;
        Arrays.sort(arr);
        for (int i = 0; i < 9; i++)
            if (arr[i] == arr[i+1])
                a--;
        print.write(a+"");
        print.close();
        scan.close();
    }
}