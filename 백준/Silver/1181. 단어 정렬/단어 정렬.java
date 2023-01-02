import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(scan.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    for (int i = 0; i < o1.length(); i++) {
                        if (o1.charAt(i) != o2.charAt(i)) {
                            return o1.charAt(i) - o2.charAt(i);
                        }
                    }
                    return 0;
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        String before = "";
        for (int i = 0; i < n; i++) {
            String s = arr[i];
            if (!before.equals(s)) {
                print.write(s + "\n");
            }
            before = s;
        }

        scan.close();
        print.close();
    }

}