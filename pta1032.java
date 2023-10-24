import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/18 20:23
 */
public class pta1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] ints = new int[100010];
        int Max = -1;
        int MaxIndex = -1;
        for (int i = 0; i < n; i++) {
            String[] split = bufferedReader.readLine().split(" ");
            int index = Integer.parseInt(split[0]);
            int value = Integer.parseInt(split[1]);
            ints[index] += value;
            if (ints[index] > Max) {
                Max = ints[index];
                MaxIndex = index;
            }
        }
        System.out.println(MaxIndex + " " + Max);
    }
}
