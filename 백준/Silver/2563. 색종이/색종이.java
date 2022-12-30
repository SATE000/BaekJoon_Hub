import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int n = Integer.parseInt(scan.readLine());
        boolean[][] arr = new boolean[100][100];
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(scan.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            for (int j = a; j < a + 10; j++) {
                for (int k = b; k < b + 10; k++) {
                    if(!arr[j][k]) {
                        arr[j][k] = true;
                        answer++;
                    }
                }
            }
        }
        
        print.write(answer+"");
        
		scan.close();
		print.close();
	}
    
}