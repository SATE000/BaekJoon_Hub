import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(scan.readLine());
        people[] arr = new people[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(scan.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            arr[i] = new people(age, name);
        }

        Arrays.sort(arr, new Comparator<people>() {
            @Override
            public int compare(people o1, people o2) {
                if (o1.age == o2.age) {
                    return 0;
                } else {
                    return o1.age - o2.age;
                }
            }
        });

        for (int i = 0; i < n; i++) {
            print.write(arr[i].age + " " + arr[i].name + "\n");
        }

        scan.close();
        print.close();
    }

}

class people {
    int age;
    String name;

    public people(int age, String name) {
        this.age = age;
        this.name = name;
    }
}