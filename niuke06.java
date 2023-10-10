import java.util.Scanner;

public class niuke06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String da = scanner.next();
        String b = scanner.next();
        String db = scanner.next();
        String[] arra = a.split("");
        String[] arrb = b.split("");
        String num1 = "";
        for (int i = 0; i < arra.length; i++) {
            if (arra[i].equals(da)) {
                num1 += da;
            }
        }
        String num2 = "";
        for (int i = 0; i < arrb.length; i++) {
            if (arrb[i].equals(db)) {
                num2 += db;
            }
        }
        if (num1.equals("") || num2.equals("")) {
            System.out.println("0");
        } else {
            System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
        }


    }
}
