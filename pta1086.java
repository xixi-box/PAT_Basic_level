import java.util.Scanner;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/11/7 21:00
 */
public class pta1086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int num = n1 * n2;
        int[] res = new int[1000];
        int i = 1, y = 0, z = 1;
        while (num != 0) {
            res[i++] = num % 10;
            num /= 10;
        }
        for (int j = i - 1; j > 0; j--) {
            y += res[j] * z;
            z = z * 10;
        }
        System.out.println(y);
    }
}
