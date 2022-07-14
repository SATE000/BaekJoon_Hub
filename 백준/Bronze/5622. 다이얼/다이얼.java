import java.io.*;

public class Main {
    
    public static int second (String s) {
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'A': case 'B': case 'C':
                    num += 3;
                    break;
                case 'D': case 'E': case 'F':
                    num += 4;
                    break;
                case 'G': case 'H': case 'I':
                    num += 5;
                    break;
                case 'J': case 'K': case 'L':
                    num += 6;
                    break;
                case 'M': case 'N': case 'O':
                    num += 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    num += 8;
                    break;
                case 'T': case 'U': case 'V':
                    num += 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    num += 10;
                    break;
            }
        }
        return num;
    }
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = scan.readLine();
        print.write(second(s) + "\n");
        
        print.close();
        scan.close();
    }
    
}