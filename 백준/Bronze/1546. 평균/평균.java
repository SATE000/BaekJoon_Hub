import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int length = Integer.parseInt(scan.readLine());
        int[] arr = new int[length];
        StringTokenizer st = new StringTokenizer(scan.readLine());
        for (int i = 0; i < length; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        double average = 0;
        for (int i = 0; i < length; i++) 
            average += (((double)arr[i] / arr[length-1]) * 100) / length;
        print.write(average+"");
        print.close();
        scan.close();
    }
}