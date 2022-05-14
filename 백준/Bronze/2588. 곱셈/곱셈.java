import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int first = sc.nextInt();
        int second = sc.nextInt();
        
        int one = second % 10;
        int ten = (second % 100) / 10;
        int hundred = second / 100;
        
        System.out.println(first*one);
        System.out.println(first*ten);
        System.out.println(first*hundred);
        System.out.println(first*second);
    }
}