import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] arr = new int[9];
        int max = 0, index = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(scan.readLine());
            if (arr[i] > max) {
                max = arr[i];
                index = i + 1;
            }
        }
        print.write(max + "\n" + index);
        print.close();
        
    }
}