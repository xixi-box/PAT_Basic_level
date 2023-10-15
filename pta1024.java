import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/13 22:04
 */
public class pta1024 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        BigDecimal s =  new BigDecimal(str);
        System.out.println(s.toPlainString());
    }
}
