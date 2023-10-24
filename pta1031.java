import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/17 21:50
 */
public class pta1031 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            boolean flag = false;
            String num = bufferedReader.readLine();
            try {
                String[] split = num.split("");
                for (int j = 0; j < split.length - 1; j++) {
                    Integer.parseInt(split[j]);
                }
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j < split.length - 1; j++) {
                    list.add(Integer.parseInt(split[j]));
                }
                int weight = (7 * list.get(0) + 9 * list.get(1) + 10 * list.get(2) +
                        5 * list.get(3) + 8 * list.get(4) + 4 * list.get(5) + 2 * list.get(6) +
                        list.get(7) + 6 * list.get(8) + 3 * list.get(9) + 7 * list.get(10) +
                        9 * list.get(11) + 10 * list.get(12) + 5 * list.get(13) + 8 * list.get(14) +
                        4 * list.get(15) + 2 * list.get(16)) % 11;
                char m;
                switch (weight) {
                    case 0:
                        m = '1';
                        break;
                    case 1:
                        m = '0';
                        break;
                    case 2:
                        m = 'X';
                        break;
                    case 3:
                        m = '9';
                        break;
                    case 4:
                        m = '8';
                        break;
                    case 5:
                        m = '7';
                        break;
                    case 6:
                        m = '6';
                        break;
                    case 7:
                        m = '5';
                        break;
                    case 8:
                        m = '4';
                        break;
                    case 9:
                        m = '3';
                        break;
                    default:
                        m = '2';
                }
                flag = (split[17].charAt(0) == m);
                if (!flag) {
                    strings.add(num);
                }
            } catch (NumberFormatException e) {
                strings.add(num);
            }

        }
        if (strings.isEmpty())
            System.out.println("All passed");
        else {
            for (String s : strings)
                System.out.println(s);
        }
    }
}
