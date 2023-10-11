import java.util.ArrayList;
import java.util.Scanner;

public class pta1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (b != 0) {
                integers.add(a * b);
                integers.add(b - 1);
            } else
                break;
        }
        if (integers.size() == 0) {
            System.out.println("0 0");
        } else {
            for (int i = 0; i < integers.size(); i++) {
                if (i != integers.size() - 1) {
                    System.out.printf("%d ", integers.get(i));
                } else
                    System.out.printf("%d", integers.get(i));
            }
        }

    }
}
