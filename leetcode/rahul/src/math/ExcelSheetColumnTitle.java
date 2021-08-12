package math;

import java.util.Scanner;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(convertToTitle(num));
        scanner.close();
    }

    public static String convertToTitle(int n) {
//         String ans = "";
//         while(n-- > 0){
//             ans = (char)((n%26) + 'A') + ans;

//             n /= 26;
//         }
//         return ans;
        return n == 0 ? "" : convertToTitle(--n / 26) + (char) ((n % 26) + 'A');
    }
}
