package math;

import java.util.Scanner;

public class PowBinaryExponential {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        int exp = scanner.nextInt();

        System.out.println(myPow(num, exp));
    }

    public static double myPow(double a, int b) {
        if (b == 0) {
            return 1;
        } else if (b == Integer.MIN_VALUE) {
            a = a * a;
            b = b / 2;
        } else if (b < 0) {
            b = -b;
            a = 1 / a;
        }
        double res = Math.pow(a, b / 2);
        if (b % 2 == 1)
            return res * res * a;
        else
            return res * res;
    }
}
