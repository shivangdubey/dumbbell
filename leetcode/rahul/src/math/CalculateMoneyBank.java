package math;

import java.util.Scanner;

public class CalculateMoneyBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(totalMoney(num));
    }

    public static int totalMoney(int n) {
        int r = n % 7, d = n / 7;
        // return d * 28 + (d - 1) * d / 2 * 7 + (r + 1 + 2 * d) * r / 2;
        return d * 28 + ((d - 1) * d >> 1) * 7 + ((r + 1 + (d << 1)) * r >> 1);
    }
}
