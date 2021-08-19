package math;

import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(isUgly(num));
    }

    public static boolean isUgly(int n) {
        for (int i = 2; i < 6 && n > 0; i++) {
            if (i == 4)
                continue;
            while (n % i == 0) {
                n /= i;
            }
        }
        return n == 1;
    }
}
