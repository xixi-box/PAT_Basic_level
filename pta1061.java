import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/30 21:57
 */
public class pta1061 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
        int[] score = new int[M];
        int[] asw = new int[M];
        s = bufferedReader.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            score[i] = Integer.parseInt(s[i]);

        }
        s = bufferedReader.readLine().split(" ");
        for (int i = 0; i < M; i++) {
            asw[i] = Integer.parseInt(s[i]);

        }
        int sum;
        for (int i = 0; i < N; i++) {
            sum = 0;
            s = bufferedReader.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                if (Integer.parseInt(s[j]) == asw[j]) {
                    sum += score[j];
                }
            }
            System.out.println(sum);
        }

    }
}