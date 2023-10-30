import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/28 22:23
 */
public class pta1054 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] src = bufferedReader.readLine().split(" ");
        double sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            try {
                double temp = Double.parseDouble(src[i]);
                String[] split = src[i].split("\\.");
                if (temp >= -1000 && temp <= 1000 && (split.length == 1 || (split.length == 2 && split[1].length() <= 2))) {
                    sum += temp;
                    count++;
                } else {
                    System.out.println("ERROR: " + src[i] + " is not a legal number");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: " + src[i] + " is not a legal number");
            }
        }
        if (count == 0) {
            System.out.println("The average of " + count + " numbers is Undefined");
        } else if (count == 1) {
            System.out.printf("The average of %d number is %.2f\n", count, sum / count);
        } else {
            System.out.printf("The average of %d numbers is %.2f\n", count, sum / count);
        }
    }
}
