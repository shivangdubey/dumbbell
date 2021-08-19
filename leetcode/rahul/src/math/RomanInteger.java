package math;

import java.util.Map;
import java.util.Scanner;

public class RomanInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(romanToInt(str));
        scanner.close();
    }

    public static int romanToInt(String s) {
        int value = 0;
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        for (int i = s.length() - 1; i >= 0; i--) {
            int curVal = map.get(s.charAt(i));
            if (i != 0 && map.get(s.charAt(i - 1)) < curVal) {
                value -= map.get(s.charAt(i - 1));
                i--;
            }
            value += curVal;

        }
        return value;
    }
}
