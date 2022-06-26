import java.io.*;

public class Main {
    public static int selfnum (int i) {
        int a = i;
        while (i != 0) {
            a += i % 10;
            i /= 10;
        }
        return a;
    }
    public static void main (String[] args) throws IOException {
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] arr = new boolean[10000];
        for (int i = 1; i < 10001; i++) {
            int num = selfnum(i);
            if (num < 10001)
                arr[num-1] = true;
        }
        for (int i = 0; i < arr.length; i++)
            if (!arr[i])
                print.write((i+1)+"\n");
        print.close();
    }
}