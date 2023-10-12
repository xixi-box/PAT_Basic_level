import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/12 20:43
 */
public class pta1020 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();

        int n = Integer.parseInt(s.split(" ")[0]);
        double need = Integer.parseInt(s.split(" ")[1]);
        double[][] cake = new double[1010][2];
        String[] s1 = bufferedReader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            cake[i][0] = Double.parseDouble(s1[i]);
        }
        String[] s2 = bufferedReader.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            cake[i][1] = Double.parseDouble(s2[i]) / cake[i][0];
        }
        //把月饼按照价格高低排序
        Arrays.sort(cake, (o1, o2) -> Double.compare(o2[1], o1[1]));
        double sum = 0;
        for (int i = 0; i < n; i++) {
            //现存的比需求量多
            if (cake[i][0] >= need) {
                sum += need * cake[i][1];
                break;
            } else {
                need -= cake[i][0];
                sum += cake[i][0] * cake[i][1];
            }
        }
        System.out.printf("%.2f", sum);
    }
}
