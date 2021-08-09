package math;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertIntegerToSumOfTwoNoZeroIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(Arrays.toString(getNoZeroIntegers(num)));
    }


    public static int[] getNoZeroIntegers(int n) {
        int temp = n - 1;
        int[] ans = new int[2];
        while (temp > 0) {
            ans[0] = temp;
            ans[1] = n - temp;
            if (check(ans[0], ans[1])) {
                break;
            }
            temp--;
        }
        return ans;
    }

    public static boolean check(int a, int b) {
        int temp = a;
        int rem = 0;
        boolean ch = true;
        while (temp > 0) {
            rem = temp % 10;
            if (rem == 0) {
                ch = false;
                break;
            }
            temp /= 10;
        }
        temp = b;
        while (temp > 0) {
            rem = temp % 10;
            if (rem == 0) {
                ch = false;
                break;
            }
            temp /= 10;
        }
        return ch;
    }

}
