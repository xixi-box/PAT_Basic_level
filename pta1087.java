import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/11/8 20:10
 */
public class pta1087 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        HashSet<Integer> res = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            int item = i / 2 + i / 3 + i / 5;
            res.add(item);
        }
        System.out.println(res.size());
    }
}
