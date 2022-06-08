import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(scan.readLine());
        int b = Integer.parseInt(scan.readLine());
        int c = Integer.parseInt(scan.readLine());
        int total = a * b * c;
        int arr[] = {0,0,0,0,0,0,0,0,0,0};
        while (true) {
            if (total < 10) {
                arr[total]++;
                break;
            } else {
                arr[total%10]++;
                total /= 10;
            }
        }
        for (int i = 0; i < arr.length; i++)
            print.write(arr[i]+"\n");
        print.close();
        scan.close();
    }
}