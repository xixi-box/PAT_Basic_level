import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/11/3 21:06
 */
public class pta1077 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int teacher;
        int sum;
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            sum = 0;
            String[] s1 = bufferedReader.readLine().split(" ");
            teacher = Integer.parseInt(s1[0]);
            for (int j = 1; j < s1.length; j++) {
                if (Integer.parseInt(s1[j]) >= 0 && Integer.parseInt(s1[j]) <= M) {
                    res.add(Integer.parseInt(s1[j]));
                }

            }
            //去掉最高和最低
            res.remove(Collections.max(res));
            res.remove(Collections.min(res));

            for (Integer j : res) {
                sum += j;
            }
            double ave = (double) sum / res.size();
            System.out.println(Math.round((teacher + ave) / 2));
            res.clear();
        }
    }
}
