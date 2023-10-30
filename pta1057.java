import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/30 21:16
 */
public class pta1057 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] charArray = bufferedReader.readLine().toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                sum += (charArray[i] - 'A' + 1);
            } else if (Character.isLowerCase(charArray[i])) {
                sum += (charArray[i] - 'a' + 1);
            }
        }
        String binaryString = Integer.toBinaryString(sum);
        String[] split = binaryString.split("");
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("0")) {
                count0++;
            } else {
                count1++;
            }
        }
        if (sum == 0) {
            System.out.println("0 0");
        } else {
            System.out.println(count0 + " " + count1);
        }

    }
}
