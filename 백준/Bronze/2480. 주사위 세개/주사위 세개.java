import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] dice = new int[3];
        int price;
        
        for (int i = 0; i < dice.length; i++) {
            dice[i] = sc.nextInt();
        }
        
        sc.close();
        
        Arrays.sort(dice);
        
        if (dice[0] == dice[2]) {
            price = 10000 + 1000 * dice[2];
        } else if (dice[1] == dice[0] || dice[1] == dice[2]) {
            price = 1000 + 100 * dice[1];
        } else {
            price = 100 * dice[2];
        }
        System.out.println(price);
    }
} 