import java.util.Scanner;
/**
 * @author xixibox
 * @version 1.0
 * @date 2023/11/8 21:29
 */


public class pta1091 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt(); // 读取待检测的数字的数量
        for (int i = 0; i < M; i++) {
            int num = scanner.nextInt(); // 读取每一个待检测的数字
            boolean flag = false; // 标记是否找到N-自守数
            for (int N = 1; N < 10; N++) { // 遍历N的可能值
                int square = N * num * num; // 计算NK^2
                String strNum = String.valueOf(num); // 将待检测的数字转换为字符串
                String strSquare = String.valueOf(square); // 将NK^2转换为字符串
                // 如果NK^2的末尾几位与待检测的数字相同，则找到了N-自守数
                if (strSquare.substring(strSquare.length() - strNum.length()).equals(strNum)) {
                    System.out.println(N + " " + square); // 输出N和NK^2
                    flag = true; // 标记已找到N-自守数
                    break; // 找到后就可以跳出循环
                }
            }
            if (!flag) { // 如果没有找到N-自守数
                System.out.println("No"); // 输出"No"
            }
        }
        scanner.close();
    }
}
