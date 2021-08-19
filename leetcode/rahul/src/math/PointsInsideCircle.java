package math;

import java.util.Arrays;
import java.util.Scanner;

public class PointsInsideCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noP = scanner.nextInt();
        int noQ = scanner.nextInt();
        int[][] points = new int[noP][2];
        int[][] queries = new int[noQ][3];

        for (int i = 0; i < noP; i++) {
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }

        for (int i = 0; i < noQ; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
            queries[i][2] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(countPoints(points, queries)));
    }

    public static int[] countPoints(int[][] points, int[][] queries) {
        int[] answer = new int[queries.length];
        int k = 0;
        for (int[] i : queries) {
            int count = 0;
            for (int[] j : points) {
                if ((j[0] - i[0]) * (j[0] - i[0]) + (j[1] - i[1]) * (j[1] - i[1]) <= i[2] * i[2]) {
                    count++;
                }
            }
            answer[k++] = count;
        }

        return answer;
    }
}
