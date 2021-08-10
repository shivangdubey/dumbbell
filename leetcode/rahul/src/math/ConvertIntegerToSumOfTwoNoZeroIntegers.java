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
        n--;
        int m = 1;
        int[] ans = {m, n};

        while (contains(ans[0]) || contains(ans[1])) {
            ans[0]++;
            ans[1]--;
        }

        return ans;
    }

    public static boolean contains(int n) {
        while (n != 0) {
            if (n % 10 == 0)
                return true;
            n = n / 10;
        }
        return false;
    }

}
