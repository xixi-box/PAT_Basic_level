import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/25 22:17
 */
public class pta1043 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] charArray = bufferedReader.readLine().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = {'P', 'A', 'T', 'e', 's', 't'};
        for (char c : chars) {
            map.put(c, 0);
        }
        for (char c : charArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
        }
        do {
            for (char c : chars) {
                if (map.get(c) > 0) {
                    System.out.print(c);
                    map.put(c, map.get(c) - 1);
                }
            }
        } while (map.get('P') > 0 || map.get('A') > 0 || map.get('T') > 0 || map.get('e') > 0 || map.get('s') > 0 || map.get('t') > 0);
    }
}
