package math;

import java.util.Scanner;

public class BulbSwitcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(bulbSwitch(num));
    }

    public static int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}
