import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/25 21:36
 */
public class pta1041 {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            String[] strings = bufferedReader.readLine().split(" ");
            map.put(strings[1], strings[0] + " " + strings[2]);
        }
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] split = bufferedReader.readLine().split(" ");
        for (String s : split) {
            System.out.println(map.get(s));
        }

    }
}