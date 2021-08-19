package math;

import java.util.Scanner;

public class MinOperationArrayEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(minOperations(num));
    }

    public static int minOperations(int n) {
        return n * n / 4;
//        int mid=n/2;
//        return mid*(mid+n%2);
//
//        int odd = 1;
//        int count = 0;
//        while(odd <= n){
//            count += (n - odd);
//            odd += 2;
//        }
//        return count;
    }
}
