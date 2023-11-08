import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/11/8 22:04
 */
public class pta1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int Max = -1;
        List<Integer> res = new ArrayList<>();
        int[] cake = new int[N + 1];
        for (int i = 0; i < M; i++) {
            List<Integer> list = Arrays.stream(bufferedReader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            for (int j = 0; j < list.size(); j++) {
                cake[j + 1] += list.get(j);
            }
        }
        for (int i = 1; i <= N; i++) {
            if (cake[i] == Max) {
                res.add(i);
            } else if (cake[i] > Max) {
                res.clear();
                Max = cake[i];
                res.add(i);
            }
        }
        System.out.println(Max);
        Collections.sort(res);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i));
            if (i != res.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
