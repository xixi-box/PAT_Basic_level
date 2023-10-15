import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/14 22:01
 */
public class pta1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                System.in));
        String[] split = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        String result = split[1];
        int balance;
        int layout = 1;//层级数
        int Max = 1;//每一行的星星数 可变 用于控制打印星星
        int SumMax;//每一行的最大星星数 不可变 用于控制打印空格
        if (n != 0) {
            if (n == 1) {
                System.out.println(result);
                System.out.println("0");
            } else if (n == 2) {
                System.out.println(result);
                System.out.println(result);
                System.out.println("0");
            } else {
                n -= 1;
                balance = n;
                for (int i = 1; i <= 1010; i++) {
                    if (n < (2 * (2 * i + 1))) {
                        balance = n;
                        break;
                    }
                    n -= (2 * (2 * i + 1));
                    layout += 2;
                    Max = (2 * i + 1);
                }
                SumMax = Max;
                for (int i = 0; i < layout / 2 + 1; i++) {
                    for (int j = 0; j < (SumMax - Max) / 2; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < Max; j++) {
                        System.out.print(result);
                    }
                    Max -= 2;
                    System.out.println();
                }
                Max += 4;
                for (int i = 0; i < layout / 2; i++) {
                    for (int j = 0; j < (SumMax - Max) / 2; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < Max; j++) {
                        System.out.print(result);
                    }
                    Max += 2;
                    System.out.println();
                }
                System.out.println(balance);
            }
        }
    }
}