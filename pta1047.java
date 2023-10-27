import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/26 21:46
 */

public class pta1047 {
    //这段代码的超时问题可能是由于在循环中进行了多次 map 查询操作导致的。
    // 每次调用 map.get(teamNumber) 都会进行一次查询，这在数据量大的情况下可能会导致效率问题。
    // 你可以尝试将查询结果存储在一个变量中，以减少查询次数。以下是修改后的代码：
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int MaxScore = -1;
        int MaxTeam = -1;
        for (int i = 0; i < n; i++) {
            String[] split = bufferedReader.readLine().split(" ");
            String[] team = split[0].split("-");
            int teamNumber = Integer.parseInt(team[0]);
            int score = Integer.parseInt(split[1]);
            map.put(teamNumber, map.getOrDefault(teamNumber, 0) + score);
            if (map.get(teamNumber) > MaxScore) {
                MaxTeam = teamNumber;
                MaxScore = map.get(teamNumber);
            }
        }
        System.out.println(MaxTeam + " " + MaxScore);
    }
}
