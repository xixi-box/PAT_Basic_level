import java.util.Scanner;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/28 21:05
 */
public class pta1051 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        double a, ai, b, bi;
        a = scanner.nextDouble();
        ai = scanner.nextDouble();
        b = scanner.nextDouble();
        bi = scanner.nextDouble();

        double A = a * b * Math.cos(ai) * Math.cos(bi) - a * b * Math.sin(ai) * Math.sin(bi);
        double B = a * b * Math.cos(ai) * Math.sin(bi) + a * b * Math.sin(ai) * Math.cos(bi);
        if (A + 0.005 >= 0 && A < 0) {
            System.out.printf("0.00");
        } else {
            System.out.printf("%.2f", A);
        }
        if (B >= 0) {
            System.out.printf("+%.2fi", B);
        } else if (B + 0.005 >= 0 && B < 0) {
            System.out.printf("+0.00i");
        } else {
            System.out.printf("%.2fi", B);
        }

    }
}
