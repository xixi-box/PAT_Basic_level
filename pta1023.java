import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/13 12:18
 */
public class pta1023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        int count = 0;//0的个数
        for (int i = 0; i < 10; i++) {
            int i1 = scanner.nextInt();
            if (i == 0)
                count = i1;
            if (i1 != 0 && i != 0) {
                for (int j = 0; j < i1; j++)
                    integers.add(i);
            }
        }
        //从小到大排序
        Collections.sort(integers);
        if (count == 0) {
            integers.forEach(System.out::print);
        } else {
            System.out.printf("%d", integers.get(0));
            for (int i = 0; i < count; i++) {
                System.out.printf("0");
            }
            for (int i = 1; i < integers.size(); i++) {
                System.out.printf("%d", integers.get(i));
            }
        }
    }
}
