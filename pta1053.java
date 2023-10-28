import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/28 21:47
 */
public class pta1053 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N, D;
        double e;
        String[] s = bufferedReader.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        e = Double.parseDouble(s[1]);
        D = Integer.parseInt(s[2]);
        double maybe = 0;
        double must = 0;
        int empty;
        for (int i = 0; i < N; i++) {
            empty = 0;
            List<Double> collect = Arrays.stream(bufferedReader.readLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());
            double k = collect.get(0);
            for (int j = 1; j < collect.size(); j++) {
                if (collect.get(j) < e) {
                    empty++;
                }
            }
            if (empty > k / 2 && k > D) {
                must++;
            } else if (empty > k / 2) {
                maybe++;
            }

        }
        System.out.printf("%.1f%% %.1f%%", maybe / N * 100, must / N * 100);
    }
}
