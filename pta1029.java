import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/16 21:54
 */
public class pta1029 {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] split1 = bufferedReader.readLine().split("");
        String[] split2 = bufferedReader.readLine().split("");
        HashSet<String> strings1 = new LinkedHashSet<>();
        HashSet<String> strings2 = new LinkedHashSet<>();
        //处理字符串1
        change(strings1, split1);
        change(strings2, split2);
        //和2进行匹配
        for (String s : strings1) {
            if (!strings2.contains(s)) {
                System.out.print(s);
            }
        }

    }

    public static void change(Set<String> strings, String[] split) {
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("_")) {
                strings.add(split[i]);
            } else {
                try {
                    strings.add(String.valueOf(Integer.parseInt(split[i])));
                } catch (NumberFormatException e) {
                    strings.add(split[i].toUpperCase());
                }

            }
        }
    }
}
