import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/11/1 21:53
 */
public class pta1066 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        int m = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        int min = Integer.parseInt(s[2]);
        int max = Integer.parseInt(s[3]);
        int flag = Integer.parseInt(s[4]);
        for (int i = 0; i < m; i++) {
            String[] s1 = bufferedReader.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                int temp = Integer.parseInt(s1[j]);
                //如果不在范围之内就输出
                if (!(temp >= min && temp <= max)) {
                    System.out.printf("%03d", temp);
                } else {
                    System.out.printf("%03d", flag);
                }
                if (j != n - 1) {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }

    }
}
