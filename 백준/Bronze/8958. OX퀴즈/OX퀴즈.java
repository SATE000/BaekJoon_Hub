import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int itry = Integer.parseInt(scan.readLine());
        int[] arr = new int[itry];
        for (int i = 0; i < itry; i++) {
            String answer = scan.readLine();
            int score = 1;
            for (int j = 0; j < answer.length(); j++) {
                if (answer.charAt(j) == 'O') {
                    arr[i] += score;
                    score++;
                }
                else
                    score = 1;
            }
        }
        for (int i = 0; i < arr.length; i++)
            print.write(arr[i] + "\n");
        print.close();
        scan.close();
    }
}