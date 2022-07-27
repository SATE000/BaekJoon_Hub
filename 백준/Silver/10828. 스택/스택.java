import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    public static void main (String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(scan.readLine());
        Stack s = new Stack(n);
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(scan.readLine());
            switch (st.nextToken()) {
                case "push" :
                    int j = Integer.parseInt(st.nextToken());
                    s.push(j);
                    break;
                case "pop" :
                    print.write(s.pop()+"\n");
                    break;
                case "size" :
                    print.write(s.size()+"\n");
                    break;
                case "empty" :
                    print.write(s.empty()+"\n");
                    break;
                case "top" :
                    print.write(s.top()+"\n");
                    break;
            }
        }
        
        print.close();
        scan.close();
    }
    
}

class Stack {
    int[] arr;
    int index = 0;
    public Stack (int n) {
        arr = new int[n];
    }
    
    public void push (int i) {
        arr[index] = i;
        index++;
        return;
    }
    
    public int pop () {
        if (index == 0) return -1;
        index--;
        return arr[index];
    }
    
    public int size () {
        return index;
    }
    
    public int empty () {
        if (index == 0) return 1;
        else return 0;
    }
    
    public int top () {
        if (index == 0) return -1;
        return arr[index-1];
    }
}