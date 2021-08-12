package math;

import java.util.Scanner;

public class StringGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        System.out.println(gcdOfStrings(s1, s2));
        scanner.close();
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";

        if (str2.length() == 0) return str1;

        return gcdOfStrings(str2, str1.substring(0, str1.length() % str2.length()));
    }
}
