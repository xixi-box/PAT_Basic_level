import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/11/1 20:25
 */
public class pta1062 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        String[] split1 = s[0].split("/");
        String[] split2 = s[1].split("/");
        double num1=Double.parseDouble(split1[0]) / Double.parseDouble(split1[1]);
        double num2=Double.parseDouble(split2[0]) / Double.parseDouble(split2[1]);
        double min = Math.min(num1, num2);
        double max = Math.max(num1, num2);
        double monther = Double.parseDouble(s[2]);
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 1; i <= monther; i++) {
            //如果是最简式，看看符不符合规则
            if (gcd(i, (int) monther) == 1) {
                double temp = i / monther;
                if (temp > min && temp < max) {
                    stringBuilder.append(i + "/" + (int) monther + " ");
                }
            }
        }
        String s1 = new String(stringBuilder);
        System.out.println(s1.trim());
    }

    // 计算最大公约数
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
