import java.util.ArrayList;
import java.util.Scanner;

public class pta1004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> number = new ArrayList<>();
        ArrayList<Integer> score = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            name.add(scanner.next());
            number.add(scanner.next());
            score.add(scanner.nextInt());
        }
        int idxMax = 0, idxMin = 0;
        int max = -1, min = 101;
        for (int i = 0; i < n; i++) {
            if (score.get(i) > max) {
                max = score.get(i);
                idxMax = i;
            }
            if (score.get(i) < min) {
                min = score.get(i);
                idxMin = i;
            }
        }
        System.out.println(name.get(idxMax) + " " + number.get(idxMax));
        System.out.println(name.get(idxMin) + " " + number.get(idxMin));
    }
}
