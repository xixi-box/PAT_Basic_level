import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/24 21:51
 */
public class pta1037 {
    public static void main(String[] args) throws IOException {
        int Galleon = 17 * 29;
        int Sickle = 29;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] split = bufferedReader.readLine().split(" ");
        String[] split1 = split[0].split("\\.");
        String[] split2 = split[1].split("\\.");
        int P = Integer.parseInt(split1[0]) * Galleon + Integer.parseInt(split1[1]) * Sickle + Integer.parseInt(split1[2]);
        int A = Integer.parseInt(split2[0]) * Galleon + Integer.parseInt(split2[1]) * Sickle + Integer.parseInt(split2[2]);
        int diff = A - P;
        if (diff < 0) {
            System.out.print("-");
            diff = -diff;
        }
        int galleon, sickle, knut;
        galleon = diff / Galleon;
        sickle = (diff - galleon * Galleon) / Sickle;
        knut = (diff - galleon * Galleon - sickle * Sickle);
        System.out.println(galleon + "." + sickle + "." + knut);

    }
}
