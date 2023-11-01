import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/31 21:42
 */
public class pta1059 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());
            map.put(n, i);
        }
        int M = Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i <= M; i++) {
            int m = Integer.parseInt(bufferedReader.readLine());
            if (!map.containsKey(m)) {
                System.out.printf("%04d: Are you kidding?\n", m);
            } else {
                if (map.get(m) == -1) {
                    System.out.printf("%04d: Checked\n", m);
                } else if (map.get(m) == 1) {
                    System.out.printf("%04d: Mystery Award\n", m);
                    map.put(m, -1);
                } else if (isPrime(map.get(m))) {
                    System.out.printf("%04d: Minion\n", m);
                    map.put(m, -1);
                } else {
                    System.out.printf("%04d: Chocolate\n", m);
                    map.put(m, 1);
                }
            }

        }
    }

    public static boolean isPrime(int N) {
        if (N == 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
