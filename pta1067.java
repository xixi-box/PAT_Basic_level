import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/11/1 22:11
 */
public class pta1067 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bufferedReader.readLine().split(" ");
        int count = Integer.parseInt(line[1]);
        String str = bufferedReader.readLine();
        while (!"#".equals(str) && (count--) > 0) {
            if (str.equals(line[0])) {
                System.out.println("Welcome in");
                break;
            } else {
                System.out.println("Wrong password: " + str);
                if (count == 0) {
                    System.out.println("Account locked");
                }

            }
            str = bufferedReader.readLine();
        }
    }
}