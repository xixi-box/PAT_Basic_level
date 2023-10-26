import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.ConcurrentMap;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/25 21:47
 */
public class pta1042 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = bufferedReader.readLine().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i]))
                charArray[i] = Character.toLowerCase(charArray[i]);
        }
        for (int i = 0; i < charArray.length; i++) {
            map.put(charArray[i], map.getOrDefault(charArray[i], 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> {
            int comp = o2.getValue().compareTo(o1.getValue());
            if (comp != 0) return comp;
            else return o1.getKey().compareTo(o2.getKey());
        });

        for (Map.Entry<Character, Integer> entry : list) {
            if (Character.isAlphabetic(entry.getKey())) {
                System.out.println(entry.getKey() + " " + entry.getValue());
                break;
            }
        }
    }
}
