import java.util.Scanner;

public class niuke02 {
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
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (src[j] % 5 == 1) {
                if (count % 2 == 0)
                    src[1011] += src[j];
                else {
                    src[1011] -= src[j];
                }
                count++;
            }
        }
        //A3
        for (int j = 0; j < n; j++) {
            if (src[j] % 5 == 2) {
                src[1012]++;
            }
        }

        //A4
        count = 0;
        for (int j = 0; j < n; j++) {
            if (src[j] % 5 == 3) {
                src[1013] += src[j];
                count++;
            }
        }
        if (count != 0) {
            src[1013] = src[1013] / count;
        }
        //A5
        for (int j = 0; j < n; j++) {
            if (src[j] % 5 == 4) {
                src[1014] = src[j] > src[1014] ? src[j] : src[1014];
            }
        }
        for (int i = 1010; i < 1015; i++) {
            if (src[i] == 0) {
                System.out.printf("N");
            } else if (i == 1013) {
                System.out.printf("%.1f ", src[i]);
            } else {
                System.out.printf("%d ", (int) src[i]);
            }
        }
    }
}
