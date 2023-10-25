import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Objects;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/25 20:07
 */
public class pta1039 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] split1 = bufferedReader.readLine().split("");
        String[] split2 = bufferedReader.readLine().split("");
        HashMap<String, Integer> boss = tongji(split1);
        HashMap<String, Integer> hong = tongji(split2);
        int lack = 0;
        for (String key : hong.keySet()) {
            int bossCount = boss.getOrDefault(key, 0);
            int hongCount = hong.getOrDefault(key, 0);
            if (bossCount < hongCount) {
                lack += hongCount - bossCount;
            }
        }
        if (lack > 0)
            System.out.println("No " + lack);
        else
            System.out.println("Yes " + (split1.length - split2.length));

    }

    public static HashMap<String, Integer> tongji(String[] strings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        return map;
    }
}
