package math;

import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }

//        System.out.print(Arrays.toString(plusOne(list)));

        int[] newList = plusOne(list);

        System.out.print("[");

        for (int i = 0; i < newList.length; i++) {
            if (i == newList.length - 1) {
                System.out.print(newList[i]);
            } else {
                System.out.print(newList[i] + ",");
            }

        }

        System.out.print("]");

        scanner.close();
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] digits2 = new int[digits.length + 1];
            digits2[0] = 1;
            return digits2;
        }
        return digits;
    }
}
