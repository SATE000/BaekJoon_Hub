import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(scan.readLine());
        int a = num;
        int sum = 0;
        while (true) {
            int first = num % 10 * 10;
            int second = num % 10 + num / 10;
            if (second > 9) second -= 10;
            num = first+second;
            sum++;
            if (a == num) break;
        }
        print.write(sum+"");
        print.close();
        scan.close();
    }
}