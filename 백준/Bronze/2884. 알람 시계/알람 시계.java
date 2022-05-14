import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        
        sc.close();
        
        if (minute < 45) {
            if (hour == 0) {
                hour = 23;
            } else {
                hour--;
            }
            minute = 60 - (45 - minute);
        } else {
            minute -= 45;
        }
        
        System.out.println(hour + " " + minute);
    }
} 