import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/30 20:56
 */
public class pta1056 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        int sum = 0;
        for (int i = 1; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {
                sum += Integer.parseInt(s[i] + s[j]);
                sum += Integer.parseInt(s[j] + s[i]);
            }
        }
        System.out.println(sum);

    }
}
