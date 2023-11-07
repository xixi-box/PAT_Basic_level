import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/11/6 20:22
 */
public class pta1080 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        int bianchengCount = Integer.parseInt(s[0]);
        int qizhongCount = Integer.parseInt(s[1]);
        int qimoCount = Integer.parseInt(s[2]);
        HashMap<String, Student> students = new HashMap<>();

        for (int i = 0; i < bianchengCount; i++) {
            String[] s1 = bufferedReader.readLine().split(" ");
            int p = Integer.parseInt(s1[1]);
            if (p >= 200) {
                students.put(s1[0], new Student(s1[0], p));
            }
        }
        for (int i = 0; i < qizhongCount; i++) {
            String[] s1 = bufferedReader.readLine().split(" ");
            Student student = students.get(s1[0]);
            if (student != null) {
                student.gmid = Integer.parseInt(s1[1]);
            }
        }

        for (int i = 0; i < qimoCount; i++) {
            String[] s1 = bufferedReader.readLine().split(" ");
            Student student = students.get(s1[0]);
            if (student != null) {
                student.gfinal = Integer.parseInt(s1[1]);
                //计算总分
                student.calculateG();
            }
        }
        List<Student> list = new ArrayList<>();
        for (Student student : students.values()) {
            if (student.g >= 60) {
                list.add(student);
            }
        }
        list.sort((s1, s2) -> {
            if (s1.g != s2.g) {
                return s2.g - s1.g;
            } else {
                return s1.id.compareTo(s2.id);
            }
        });
        for (Student student : list) {
            System.out.println(student.id + " " + student.gp + " " + (student.gmid == -1 ? "-1" : student.gmid) + " " + (student.gfinal == -1 ? "-1" : student.gfinal) + " " + student.g);
        }
    }
}

class Student {
    String id;
    int gp, gmid, gfinal, g;

    public Student(String id, int gp) {
        this.id = id;
        this.gp = gp;
        this.gmid = -1;
        this.gfinal = -1;
    }

    public void calculateG() {
        if (this.gmid > this.gfinal) {
            this.g = Math.round(this.gmid * 0.4f + this.gfinal * 0.6f);
        } else {
            this.g = this.gfinal;
        }
    }
}