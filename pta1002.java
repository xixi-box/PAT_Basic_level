import java.util.ArrayList;
import java.util.Scanner;

public class pta1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] charArray = scanner.next().toCharArray();
        int num = 0;
        for (int i = 0; i < charArray.length; i++) {
            num += charArray[i] - '0';
        }
        ArrayList<String> res = new ArrayList<>();
        while (num != 0) {
            switch (num % 10) {
                case 0:
                    res.add("ling");
                    break;
                case 1:
                    res.add("yi");
                    break;
                case 2:
                    res.add("er");
                    break;
                case 3:
                    res.add("san");
                    break;
                case 4:
                    res.add("si");
                    break;
                case 5:
                    res.add("wu");
                    break;
                case 6:
                    res.add("liu");
                    break;
                case 7:
                    res.add("qi");
                    break;
                case 8:
                    res.add("ba");
                    break;
                case 9:
                    res.add("jiu");
                    break;
                default:
                    break;
            }
            num /= 10;
        }
        for (int i = res.size() - 1; i >= 0; i--) {
            if (i != 0)
                System.out.printf("%s ", res.get(i));
            else
                System.out.printf("%s", res.get(i));
        }

    }
}
