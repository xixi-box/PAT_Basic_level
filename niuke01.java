import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息

/**
 * 要用long
 */
public class niuke01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            if (a + b > c) {
                System.out.println("Case #" + ++i + ": true");
            } else {
                System.out.println("Case #" + ++i + ": false");
            }
            i--;
        }
    }
}
