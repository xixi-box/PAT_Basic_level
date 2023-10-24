import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/24 21:28
 */
public class pta1036 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] split = bufferedReader.readLine().split(" ");
        int col = Integer.parseInt(split[0]);
        int line = (col + 1) / 2;
        for (int i = 1; i <= line; i++) {
            if (i == 1 || i == line) {
                for (int j = 1; j <= col; j++) {
                    System.out.print(split[1]);
                }
            } else {
                for (int j = 1; j <= col; j++) {
                    if (j == 1 || j == col) {
                        System.out.print(split[1]);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
