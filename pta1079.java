import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pta1079 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int count = 0;
        while (count < 10) {
            if (isPalindrome(input)) {
                System.out.println(input + " is a palindromic number.");
                break;
            } else {
                String reversed = new StringBuilder(input).reverse().toString();
                String sum = addStrings(input, reversed);
                System.out.println(input + " + " + reversed + " = " + sum);
                input = sum;
                count++;
            }
        }

        if (count == 10) {
            System.out.println("Not found in 10 iterations.");
        }
    }

    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int x = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int y = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = x + y + carry;
            carry = sum / 10;
            result.append(sum % 10);

            i--;
            j--;
        }
        return result.reverse().toString();
    }
}
