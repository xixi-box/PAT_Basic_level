import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pta1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] split = bufferedReader.readLine().split(" ");
        int c1 = Integer.parseInt(split[0]);
        int c2 = Integer.parseInt(split[1]);
        int differ = (int) Math.round((c2 - c1) / 100.0);
        int hour = differ / 3600;
        int minute = differ % 3600 / 60;
        int second = differ % 60;
        System.out.printf("%02d:%02d:%02d", hour, minute, second);
    }
}
