import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/11 21:47
 * 超时 未成功
 */
public class pta1018 {
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

        //0 B 1 C 2 J
        int[] Awin = new int[3];
        int[] Bwin = new int[3];
        in.nextToken();
        int N = (int) in.nval;
        for (int i = 0; i < N; i++) {
            in.nextToken();
            String a = in.sval;
            in.nextToken();
            String b = in.sval;
            if (a.equals("C")) {
                if (b.equals("J"))
                    Awin[1]++;
                else if (b.equals("B"))
                    Bwin[0]++;
            } else if (a.equals("J")) {

                if (b.equals("C"))
                    Bwin[1]++;
                else if (b.equals("B"))
                    Awin[2]++;
            } else if (a.equals("B")) {
                if (b.equals("C"))
                    Awin[0]++;
                else if (b.equals("J"))
                    Bwin[2]++;
            }

        }  //算出他们总共获胜的次数

        int Asum = Awin[0] + Awin[1] + Awin[2];
        int Bsum = Bwin[0] + Bwin[1] + Bwin[2];
        int Equal = N - Asum - Bsum;
        System.out.println(Asum + " " + Equal + " " + Bsum);
        System.out.println(Bsum + " " + Equal + " " + Asum);
        int maxA = 0, maxB = 0; // A和B中所有手势中，赢的最大次数
        for (int i = 0; i < 3; i++) {
            if (Awin[i] > maxA) maxA = Awin[i];
            if (Bwin[i] > maxB) maxB = Bwin[i];
        }
        // 倒序遍历所有次数（如果解不唯一，则输出按字母序最小的解）
        char j = 0, y = 0; // 甲和乙赢的次数最多的手势
        for (int i = 2; i >= 0; i--) {
            if (Awin[i] == maxA) {
                if (i == 2) j = 'J';
                if (i == 1) j = 'C';
                if (i == 0) j = 'B';
            }
            if (Bwin[i] == maxB) {
                if (i == 2) y = 'J';
                if (i == 1) y = 'C';
                if (i == 0) y = 'B';
            }
        }
        System.out.print(j + " " + y);

    }

}
