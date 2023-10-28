import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/28 20:09
 */
public class pta1050 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.parseInt(bufferedReader.readLine());
        int m = 0, n, Min = 10000;
        for (n = (int) Math.sqrt((double) N); n >= 1; n--) {
            if (N / n == 0) {
                m = N / n;
                break;
            }
        }
        List list = Arrays.stream(bufferedReader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Collections.sort(list, Collections.reverseOrder());

        int res[][] = new int[m][n];


    }
}
