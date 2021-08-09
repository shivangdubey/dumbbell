package math;

import java.util.Scanner;

public class xorOperationInAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int start = scanner.nextInt();
        int[] nums = new int[n];
        int xor = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = start + 2 * i;
            xor = nums[i] ^ xor;
        }

        System.out.println(xor);
    }
}
