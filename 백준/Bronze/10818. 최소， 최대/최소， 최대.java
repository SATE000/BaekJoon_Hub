import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int index = Integer.parseInt(scan.readLine());
        int[] arr = new int[index];
        StringTokenizer st = new StringTokenizer(scan.readLine());
        
        for (int i = 0; i < index; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        print.write(arr[0]+" "+arr[index - 1]);
        print.close();
    }
}