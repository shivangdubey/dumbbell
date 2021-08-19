package math;

import java.util.Scanner;

public class CountMatchesTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(numberOfMatches(num));
        scanner.close();
    }

    public static int numberOfMatches(int n) {
//         int count = 0;
//         while(n > 1){
//             if(n % 2 == 0){
//                 n /= 2;
//                 count += n;
//             } else {
//                 n = ((n-1)/2) + 1;
//                 count += n - 1;
//             }

//         }
//         return count;

        //logical
        return n - 1;
    }
}
