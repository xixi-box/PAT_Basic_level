import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/12 23:35
 */
public class pta1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] split = bufferedReader.readLine().split("");
        int[][] ints = new int[10][2];
        for (int i = 0; i < split.length; i++) {
            ints[Integer.parseInt(split[i])][1]++;
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i][1] != 0)
                System.out.println(i + ":" + ints[i][1]);
        }
    }
}
