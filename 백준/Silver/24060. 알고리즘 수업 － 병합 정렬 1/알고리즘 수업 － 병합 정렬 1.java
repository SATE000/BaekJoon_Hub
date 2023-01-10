import java.io.*;
import java.util.*;

public class Main {

    public static int k;
    public static int answer = -1;
    public static int count = 0;
    public static int[] tmp;

    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(scan.readLine());
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(scan.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        tmp = arr.clone();
        merge_sort(arr, 0, n-1);

        print.write(answer + "\n");
        scan.close();
        print.close();
    }

    public static void merge_sort (int[] arr, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(arr, p, q);
            merge_sort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    }

    public static void merge (int[] arr, int p, int q, int r) {
        int i = p, j = q + 1, t = 0;

        while (i <= q && j <= r) {
            if (arr[i] <= arr[j]) {
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
        }

        while (i <= q) {
            tmp[t++] = arr[i++];
        }
        while (j <= r) {
            tmp[t++] = arr[j++];
        }

        i = p;
        t = 0;

        while (i <= r) {
            arr[i++] = tmp[t++];
            count++;
            if (count == k) {
                answer = arr[i-1];
                return;
            }
        }
    }

}