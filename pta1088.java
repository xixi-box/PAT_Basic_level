import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class pta1088 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputs[] = br.readLine().split(" ");
        br.close();
        int M = Integer.valueOf(inputs[0]);
        int X = Integer.valueOf(inputs[1]);
        int Y = Integer.valueOf(inputs[2]);

        int JIA;
        int YI = 0;
        double BING = 0;
        for (JIA = 99; JIA >= 10; JIA--) {
            YI = exchange(JIA);
            BING = (double) YI / (double) Y;
            //boolean a=(diff(JIA, YI)%X==0),b=(YI%Y==0);

            if (diff(JIA, YI) == BING * X) {
                break;
            }
        }
        if (JIA == 9) {
            System.out.println("No Solution");
            return;
        }

        System.out.println(JIA + " " + Compare(M, JIA) + " " + Compare(M, YI) + " " + Compare(M, BING));

    }

    static int diff(int i, int j) {
        if (j > i) {
            return j - i;
        } else {
            return i - j;
        }
    }

    static int exchange(int i) {
        char a[] = (i + "").toCharArray();
        String s1 = a[1] + "";
        String s0 = a[0] + "";
        return Integer.valueOf(s1 + s0);
    }

    static String Compare(int M, int other) {
        if (M == other) {
            return "Ping";
        } else if (M > other) {
            return "Gai";
        } else {
            return "Cong";
        }
    }

    static String Compare(int M, double other) {
        if ((double) M == other) {
            return "Ping";
        } else if ((double) M > other) {
            return "Gai";
        } else {
            return "Cong";
        }
    }

}

