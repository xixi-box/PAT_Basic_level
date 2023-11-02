import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/11/2 21:13
 */
public class pta1069 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        int M = Integer.parseInt(s[0]);
        int N = Integer.parseInt(s[1]);
        int S = Integer.parseInt(s[2]);
        ArrayList<String> src = new ArrayList<>();
        for (int i = 1; i <= M; i++) {
            src.add(bufferedReader.readLine().trim());
        }
        ArrayList<String> res = new ArrayList<>();
        for (int i = S - 1; i < M; i += N) {
            while (res.contains(src.get(i))) {
                i++;
            }
            res.add(src.get(i));
        }
        if (res.isEmpty()) {
            System.out.println("Keep going...");
        } else {
            for (String s1 : res) {
                System.out.println(s1);
            }
        }
    }
}