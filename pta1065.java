import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/11/1 21:33
 */
public class pta1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        HashMap<Integer, Integer> wife = new HashMap<>();
        HashMap<Integer, Integer> husband = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] s = bufferedReader.readLine().split(" ");
            //存入女性的丈夫
            wife.put(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
            //存入男性的妻子
            husband.put(Integer.parseInt(s[1]), Integer.parseInt(s[0]));
        }
        int m = Integer.parseInt(bufferedReader.readLine());
        List<Integer> s = Arrays.stream(bufferedReader.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            //假设是男人，找他的妻子
            if (!(s.contains(husband.get(s.get(i))) || s.contains(wife.get(s.get(i))))) {
                res.add(s.get(i));
            }
        }
        Collections.sort(res);
        System.out.println(res.size());
        for (int i = 0; i < res.size(); i++) {
            System.out.printf("%05d", res.get(i));
            if (i != res.size() - 1) {
                System.out.printf(" ");
            }
        }
    }
}
