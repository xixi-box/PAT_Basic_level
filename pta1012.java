import java.util.Scanner;

public class pta1012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] src = new double[1020];
        for (int i = 0; i < n; i++) {
            src[i] = in.nextDouble();
        }

        //A1
        for (int j = 0; j < n; j++) {
            if (src[j] % 5 == 0 && src[j] % 2 == 0) {
                src[1010] += src[j];
            }
        }

        //A2
        int countA2 = 0;
        for (int j = 0; j < n; j++) {
            if (src[j] % 5 == 1) {
                if (countA2 % 2 == 0)
                    src[1011] += src[j];
                else {
                    src[1011] -= src[j];
                }
                countA2++;
            }
        }

        //A3
        for (int j = 0; j < n; j++) {
            if (src[j] % 5 == 2) {
                src[1012]++;
            }
        }
        //A4
        int countA4 = 0;
        for (int j = 0; j < n; j++) {
            if (src[j] % 5 == 3) {
                src[1013] += src[j];
                countA4++;
            }
        }
        if (countA4 != 0) {
            src[1013] = src[1013] / countA4;
        }
        //A5
        for (int j = 0; j < n; j++) {
            if (src[j] % 5 == 4) {
                src[1014] = src[j] > src[1014] ? src[j] : src[1014];
            }
        }
        //A1
        if (src[1010] != 0)
            System.out.printf("%d ", (int) src[1010]);
        else
            System.out.print("N ");
        //A2
        if (countA2 != 0)
            System.out.printf("%d ", (int) src[1011]);
        else
            System.out.printf("N ");
        //A3
        if (src[1012] != 0)
            System.out.printf("%d ", (int) src[1012]);
        else
            System.out.print("N ");
        //A4
        if (countA4 != 0)
            System.out.printf("%.1f ", src[1013]);
        else
            System.out.printf("N ");
        //A5
        if (src[1014] != 0)
            System.out.printf("%d", (int) src[1014]);
        else
            System.out.print("N");
    }
}
