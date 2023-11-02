import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/11/2 21:50
 */
public class pta1071 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        int total = Integer.parseInt(s[0]);
        int num = Integer.parseInt(s[1]);
        int n1, b, t, n2;
        for (int i = 0; i < num; i++) {
            String[] s1 = bufferedReader.readLine().split(" ");
            n1 = Integer.parseInt(s1[0]);
            b = Integer.parseInt(s1[1]);
            t = Integer.parseInt(s1[2]);
            n2 = Integer.parseInt(s1[3]);
            if (t > total) {
                System.out.println("Not enough tokens.  Total = " + total + ".");
                continue;
            }
            if ((n2 > n1 && b == 1) || (n2 < n1 && b == 0)) {
                total += t;
                System.out.println("Win " + t + "! Total = " + total + ".");
            } else {
                total -= t;
                System.out.println("Lose " + t + "." + " Total = " + total + ".");
            }
            if (total == 0) {
                System.out.println("Game Over.");
                break;
            }
        }
    }
}
