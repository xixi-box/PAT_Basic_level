import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/12 21:38
 */
public class pta1019 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                System.in));
        int differ = Integer.parseInt(bufferedReader.readLine());
        do {
            int n1 = TopToLow(differ);
            int n2 = LowToTop(differ);
            if (n1 == n2) {
                System.out.printf("%04d - %04d = 0000\n", n1, n2);
                break;
            }
            differ = n1 - n2;
            System.out.printf("%04d - %04d = %04d\n", n1, n2, differ);
        } while (differ != 6174);
    }

    public static int TopToLow(int X) {
        ArrayList<Integer> integers = new ArrayList<>();
        while (X != 0) {
            integers.add(X % 10);
            X /= 10;
        }
        Collections.sort(integers, Collections.reverseOrder());
        int num = 0;
        for (int i = 0; i < integers.size(); i++) {
            num = num * 10 + integers.get(i);
        }
        if (integers.size() != 4) {
            return (int) (num * Math.pow(10, 4 - integers.size()));
        }
        return num;
    }

    public static int LowToTop(int X) {
        ArrayList<Integer> integers = new ArrayList<>();
        while (X != 0) {
            integers.add(X % 10);
            X /= 10;
        }
        Collections.sort(integers);
        int num = 0;
        for (int i = 0; i < integers.size(); i++) {
            num = num * 10 + integers.get(i);
        }
        return num;
    }


}
