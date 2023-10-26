import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/26 21:30
 */
public class pta1046 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int jia = 0;
        int yi = 0;
        for (int i = 0; i < n; i++) {
            String[] split = bufferedReader.readLine().split(" ");
            int sum = Integer.parseInt(split[0]) + Integer.parseInt(split[2]);
            if (sum == Integer.parseInt(split[1]) && sum != Integer.parseInt(split[3])) {
                yi++;
            } else if (sum != Integer.parseInt(split[1]) && sum == Integer.parseInt(split[3])) {
                jia++;
            }
        }
        System.out.println(jia + " " + yi);
    }
}
