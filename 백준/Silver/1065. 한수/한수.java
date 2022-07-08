import java.io.*;

public class Main {
    public static int d (int i) {
        int num = 99; 
        if (i < 100) return i;
        else {
            for (int j = 100; j < i+1; j++) {
                if ((j/100) - ((j%100)/10) == ((j%100)/10) - (j%10)) num++;
            }
            return num;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = scan.readLine();
        int i = Integer.parseInt(s);
        int ai = d(i);
        print.write(ai+"\n");
        scan.close();
        print.close();
    }
}