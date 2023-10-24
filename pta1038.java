import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/24 22:12
 */
public class pta1038 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] split = bufferedReader.readLine().split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < split.length; i++) {
            if (map.containsKey(split[i])) {
                map.put(split[i], map.get(split[i]) + 1);
            } else {
                map.put(split[i], 1);
            }
        }
        String[] res = bufferedReader.readLine().split(" ");
        for (int i = 1; i < res.length; i++) {
            if (map.get(res[i]) == null)
                System.out.print("0");
            else
                System.out.print(map.get(res[i]));
            if (i != res.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
