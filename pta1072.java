import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/11/3 20:07
 */
public class pta1072 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        List<String> IDs = Arrays.stream(bufferedReader.readLine().split(" ")).collect(Collectors.toList());
        ArrayList<String> res = new ArrayList<>();
        int stu = 0;
        int thing = 0;
        for (int i = 0; i < N; i++) {
            res.clear();
            //处理学生
            String[] s1 = bufferedReader.readLine().split(" ");
            for (int j = 1; j < s1.length; j++) {
                if (IDs.contains(s1[j])) {
                    res.add(s1[j]);
                }
            }
            //如果有违禁物品
            if (!res.isEmpty()) {
                stu++;
                thing += res.size();
                System.out.print(s1[0] + ": ");
                for (int k = 0; k < res.size(); k++) {
                    System.out.print(res.get(k));
                    if (k != res.size() - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();

            }

        }
        System.out.println(stu + " " + thing);
    }
}
