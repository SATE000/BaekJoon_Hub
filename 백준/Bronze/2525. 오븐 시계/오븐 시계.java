import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int cooking = sc.nextInt();
        
        sc.close();
        
        int cooking_hour = cooking / 60;
        int cooking_minute = cooking % 60;
        
        minute += cooking_minute;
        hour += cooking_hour;
        
        if (minute > 59) {
            minute -= 60;
            hour++;
        }
        if (hour > 23) {
            hour -= 24;
        }
        
        System.out.println(hour + " " + minute);
    }
} 