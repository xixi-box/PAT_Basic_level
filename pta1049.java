import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/27 21:26
 */
public class pta1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();  // 读取并忽略第一行
        List<Double> nums = Arrays.stream(bufferedReader.readLine().split(" "))
                .map(Double::valueOf)
                .collect(Collectors.toList());
        double sum = 0.0;
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            sum += 1000 * nums.get(i) * (long) (i + 1) * (long) (n - i);
        }
        System.out.printf("%.2f", sum / 1000);
    }
}
