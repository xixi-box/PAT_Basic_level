import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/11/7 20:42
 */
public class pta1083 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        TreeMap<Integer, Integer> res = new TreeMap<>(Collections.reverseOrder());
        String[] s = bufferedReader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int num = Math.abs(Integer.parseInt(s[i]) - i - 1);
            res.put(num, res.getOrDefault(num, 0) + 1);
        }
        for (Integer key : res.keySet()) {
            if (res.get(key) > 1) {
                System.out.println(key + " " + res.get(key));
            }
        }
    }
}
