import java.util.Scanner;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/11/6 21:12
 */
public class pta1081 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String password = scanner.next().trim();
            if (password.length() < 6) {
                System.out.println("Your password is tai duan le.");
            } else if (!password.matches("[a-zA-Z0-9\\.]*")) {
                System.out.println("Your password is tai luan le.");
            } else if (!password.matches(".*[a-zA-Z].*") && password.matches(".*\\d.*")) {
                System.out.println("Your password needs zi mu.");
            } else if (password.matches(".*[a-zA-Z].*") && !password.matches(".*\\d.*")) {
                System.out.println("Your password needs shu zi.");
            } else {
                System.out.println("Your password is wan mei.");
            }
        }
    }
}
