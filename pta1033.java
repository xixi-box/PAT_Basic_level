import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/18 21:08
 */
public class pta1033 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Set<Character> bad = bufferedReader.readLine().chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        List<Character> type = bufferedReader.readLine().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        ArrayList<Character> res = new ArrayList<>();
        for (char t : type) {

            if (Character.isDigit(t)) {
                if (!bad.contains(t)) {
                    res.add(t);
                }
            } else if (Character.isLowerCase(t)) {
                if (!bad.contains(Character.toUpperCase(t))) {
                    res.add(t);
                }
            } else if (Character.isUpperCase(t)) {
                if (!bad.contains(t)&&!bad.contains('+')) {
                    res.add(t);
                }

            } else {
                if (!bad.contains(t)) {
                    res.add(t);
                }
            }
        }
        for (char i : res) {
            System.out.print(i);
        }

    }
}
