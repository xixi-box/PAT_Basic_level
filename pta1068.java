import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class pta1068 {
    public static void main(String[] args) throws IOException {
        // 创建一个BufferedReader对象来读取输入
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // 读取第一行的输入，并将其分割为三个字符串
        String[] s = bufferedReader.readLine().split(" ");
        // 将字符串转换为整数
        int column = Integer.parseInt(s[0]);
        int line = Integer.parseInt(s[1]);
        int min = Integer.parseInt(s[2]);
        // 创建一个二维数组来存储像素的颜色值
        int[][] pixels = new int[line][column];
        // 创建一个HashMap来存储每种颜色出现的次数
        Map<Integer, Integer> colorCount = new HashMap<>();
        for (int i = 0; i < line; i++) {
            // 读取一行输入，并将其分割为多个字符串
            String[] colors = bufferedReader.readLine().split(" ");
            for (int j = 0; j < column; j++) {
                // 将字符串转换为整数，并存储在二维数组中
                pixels[i][j] = Integer.parseInt(colors[j]);
                // 更新HashMap中对应颜色的计数
                colorCount.put(pixels[i][j], colorCount.getOrDefault(pixels[i][j], 0) + 1);
            }
        }

        // 初始化唯一颜色像素的位置和颜色值
        int uniqueColorPixelX = -1, uniqueColorPixelY = -1, uniqueColorPixelColor = -1;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                // 检查当前像素是否满足条件：颜色唯一且与周围像素的颜色差大于给定阈值
                if (colorCount.get(pixels[i][j]) == 1 && isColorDiffLargeEnough(i, j, pixels, min)) {
                    if (uniqueColorPixelX != -1) { // 如果已经找到了一个满足条件的像素，那么结果就不唯一
                        System.out.println("Not Unique");
                        return;
                    }
                    // 更新唯一颜色像素的位置和颜色值
                    uniqueColorPixelX = j + 1;
                    uniqueColorPixelY = i + 1;
                    uniqueColorPixelColor = pixels[i][j];
                }
            }
        }

        // 输出结果
        if (uniqueColorPixelX == -1) { // 如果没有找到满足条件的像素，输出"Not Exist"
            System.out.println("Not Exist");
        } else { // 否则，输出唯一颜色像素的位置和颜色值
            System.out.println("(" + uniqueColorPixelX + ", " + uniqueColorPixelY + "): " + uniqueColorPixelColor);
        }
    }

    private static boolean isColorDiffLargeEnough(int x, int y, int[][] pixels, int min) {
        // 定义8个方向
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        for (int i = 0; i < dx.length; i++) {
            int newX = x + dx[i], newY = y + dy[i];
            // 检查新位置是否在图像范围内，如果在范围内，计算颜色差并检查是否大于给定阈值
            if (newX >= 0 && newX < pixels.length && newY >= 0 && newY < pixels[0].length
                    && Math.abs(pixels[x][y] - pixels[newX][newY]) <= min) {
                return false;
            }
        }
        return true;
    }
}
