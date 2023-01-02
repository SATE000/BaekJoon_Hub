import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(scan.readLine());
        int[] arr1 = new int[n];

        StringTokenizer st = new StringTokenizer(scan.readLine());
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        int[] arr2 = arr1.clone();
        Arrays.sort(arr1);
        HashMap<Integer, Integer> answer = new HashMap<Integer, Integer>();

        int k = 0;
        for (int i = 0; i < n; i++) {
            if (!answer.containsKey(arr1[i])) {
                answer.put(arr1[i], k);
                k++;
            }
        }

        for (int i = 0; i < n; i++) {
            print.write( answer.get(arr2[i])+ " ");
        }

        scan.close();
        print.close();
    }

}