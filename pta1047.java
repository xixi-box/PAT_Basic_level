import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/26 21:46
 */

public class pta1047 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        TreeMap<Integer, Integer> map = new TreeMap<>();
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
