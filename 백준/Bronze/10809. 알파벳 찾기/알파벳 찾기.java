import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = scan.readLine();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int nIndex = s.charAt(i) - 97;
            if (arr[nIndex] == 0) arr[s.charAt(i) - 97] = i + 1;
        }
        for (int j = 0; j < arr.length; j++)
            print.write((arr[j]-1)+" ");
        
        scan.close();
        print.close();
    }
}