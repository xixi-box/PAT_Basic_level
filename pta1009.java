import java.util.Scanner;

public class pta1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();
        String[] s = next.split(" ");
        for (int i = s.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.printf("%s ", s[i]);
            else
                System.out.printf("%s", s[i]);
        }
    }
}
