import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/11/3 20:28
 */
public class pta1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        for (int i = 0; i < N; i++) {
            String[] s = bufferedReader.readLine().split(" ");
            for (String string : s) {
                String[] split = string.split("");
                if ("T".equals(split[2])) {
                    res.add(map.get(split[0]));
                    break;
                }
            }
        }
        for (Integer s : res) {
            System.out.print(s);
        }

    }
}
