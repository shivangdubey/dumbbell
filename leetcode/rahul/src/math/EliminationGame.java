package math;

import java.util.Scanner;

public class EliminationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(lastRemaining(num));
    }

    public static int lastRemaining(int n) {
        // return ((Integer.highestOneBit(n) - 1) & (n | 0x55555555)) + 1;
        // return n == 1 ? 1 : 2 * (1 + n / 2 - lastRemaining(n / 2));
        int head = 1;
        boolean left = true;
        int swap = 1;
        int temp = n;
        while (temp > 1) {
            if (left || temp % 2 == 1) {
                head += swap;
            }
            temp /= 2;
            left = !left;
            swap *= 2;

        }
        return head;
    }
}
