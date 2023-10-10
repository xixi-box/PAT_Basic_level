import java.util.Scanner;

public class niuke06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] a = scanner.next().toCharArray();
        String da = scanner.next();
        char[] b = scanner.next().toCharArray();
        String db = scanner.next();
        StringBuilder num1 = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == da.charAt(0)) {
                num1.append(da);
            }
        }
        StringBuilder num2 = new StringBuilder();
        for (int i = 0; i < b.length; i++) {
            if (b[i] == db.charAt(0)) {
                num2.append(db);
            }
        }
        if (num1.toString().equals("") || num2.toString().equals("")) {
            System.out.println("0");
        } else {
            System.out.println(Integer.parseInt(num1.toString()) + Integer.parseInt(num2.toString()));
        }

    }
}
