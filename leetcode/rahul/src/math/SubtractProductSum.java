package math;

import java.util.Scanner;

public class SubtractProductSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(subtractProductAndSum(num));
    }

    public static int subtractProductAndSum(int n) {
        int prod = 1, sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            prod *= rem;
            n /= 10;
        }

        return prod - sum;
    }
}
