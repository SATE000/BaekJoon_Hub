import java.io.*;

public class Main {
    
    public static String Fractions (int n) {
        int sum = 2;
        int count = 1;
        while (n > count)
            count += sum++;
        int i = count - n + 1;
        if (sum % 2 == 1) return (sum - i)+"/"+i;
        else return i+"/"+(sum - i);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(scan.readLine());
        print.write(Fractions(n));
        
        print.close();
        scan.close();
    }
    
}