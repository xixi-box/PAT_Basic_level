import java.util.Scanner;

public class pta1003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            char[] charArray = scanner.next().toCharArray();
            int pcount = 0, tcount = 0, pidx = 0, tidx = 0, other = 0;
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[j] == 'P') {
                    pcount++;
                    pidx = j;
                } else if (charArray[j] == 'T') {
                    tcount++;
                    tidx = j;
                } else if (charArray[j] != 'A') {
                    other++;
                }
            }
            String res;
            if (other != 0 || pcount != 1 || tcount != 1 || tidx - pidx <= 1)
                res = "NO";
            else {
                if (pidx * (tidx - pidx - 1) == charArray.length - tidx - 1)
                    res = "YES";
                else
                    res = "NO";
            }
            System.out.println(res);
        }

    }
}
