import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/11/6 21:41
 */
public class pta1082 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        double Max = -1;
        double Min = 10000;
        String MaxName = "";
        String MinName = "";
        for (int i = 0; i < n; i++) {
            String[] s = bufferedReader.readLine().split(" ");
            String id = s[0];
            double x = Double.parseDouble(s[1]);
            double y = Double.parseDouble(s[2]);
            double distance = x * x + y * y;
            if (distance < Min) {
                Min = distance;
                MinName = id;
            }
            if (distance > Max) {
                Max = distance;
                MaxName = id;
            }
        }
        System.out.println(MinName + " " + MaxName);
    }
}
