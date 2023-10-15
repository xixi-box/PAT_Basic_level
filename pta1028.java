import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/10/15 11:15
 */
public class pta1028 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int count = 0;//有效生日个数
        LocalDate MaxDate = LocalDate.of(2014, 9, 6);
        LocalDate MinDate = LocalDate.of(1814, 9, 6);
        String[] name = new String[2];
        LocalDate oldestBirthday = MaxDate;
        LocalDate youngestBirthday = MinDate;

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> brithday = new ArrayList<>();
            String[] info = bufferedReader.readLine().split(" ");
            String[] brithdayStr = info[1].split("/");
            for (String s : brithdayStr) {
                brithday.add(Integer.parseInt(s));
            }
            LocalDate brithDate = LocalDate.of(brithday.get(0), brithday.get(1), brithday.get(2));
            //检测有效性
            if (isValidBirthday(brithDate, MinDate, MaxDate)) {
                count++;
                if (brithDate.isAfter(youngestBirthday)) {
                    youngestBirthday = brithDate;
                    name[0] = info[0];
                }
                if (brithDate.isBefore(oldestBirthday)) {  //找最大值
                    oldestBirthday = brithDate;
                    name[1] = info[0];
                }
            }

        }

        if (count != 0)
            System.out.println(count + " " + name[1] + " " + name[0]);
        else
            System.out.println("0");
    }

    private static boolean isValidBirthday(LocalDate birthday, LocalDate minDate, LocalDate maxDate) {
        return !birthday.isBefore(minDate) && !birthday.isAfter(maxDate);
    }


}
