package math;

import java.util.Scanner;

public class MinCostMoveChip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] a = new int[num];

        for (int i = 0; i < num; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println(minCostToMoveChips(a));
    }

    public static int minCostToMoveChips(int[] position) {
        int odd = 0;
        for (int i : position) {
            if (i % 2 == 1) {
                odd++;
            }
        }
        return Math.min(odd, position.length - odd);
    }
}

