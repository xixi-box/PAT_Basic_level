import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/17 20:30
 */
public class pta1030 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] split = bufferedReader.readLine().split(" ");
        int p = Integer.parseInt(split[1]);
        List<Integer> list = Arrays.stream(bufferedReader.readLine().split(" "))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
        int Max = -1;
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - i - 1; j > 0; j--) {
                int length = list.lastIndexOf(j) - list.indexOf(i) + 1;
                if (list.get(j) / list.get(i) <= p && length > Max) {
                    Max = length;
                }
            }
        }
        System.out.println(Max);
    }
}
