import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author xixibox
 * @version 1.0
 * @date 2023/11/7 21:11
 */


public class pta1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        // 创建一个映射，用于存储学校名称到 School 对象的映射
        Map<String, School> schoolMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] s = bufferedReader.readLine().split(" ");
            String schoolName = s[2].toLowerCase();
            int score = Integer.parseInt(s[1]);
            String level = s[0].substring(0, 1);

            // 如果学校不存在于映射中，创建一个新的 School 对象
            if (!schoolMap.containsKey(schoolName)) {
                schoolMap.put(schoolName, new School());
            }

            School school = schoolMap.get(schoolName);

            // 根据考试级别更新学校的得分
            if (level.equals("B")) {
                school.addB(score);
            } else if (level.equals("A")) {
                school.addA(score);
            } else if (level.equals("T")) {
                school.addT(score);
            }

            // 更新学校的考生人数
            school.incrementNumOfStudents();
        }
        for (School school : schoolMap.values()) {
            school.Cal();
        }
        // 创建一个最大堆，用于对学校进行排名
        PriorityQueue<School> queue = new PriorityQueue<>(
                (a, b) -> {
                    if (a.getTotalScore() != b.getTotalScore()) {
                        return b.getTotalScore() - a.getTotalScore();
                    } else if (a.getNumOfStudents() != b.getNumOfStudents()) {
                        return a.getNumOfStudents() - b.getNumOfStudents();
                    } else {
                        return a.getName().compareTo(b.getName());
                    }
                }
        );

        queue.addAll(schoolMap.values());
        // 输出学校排行榜
        System.out.println(schoolMap.size());
        int rank = 1;
        int prevTotalScore = -1;
        while (!queue.isEmpty()) {
            School school = queue.poll();
            if (prevTotalScore != school.getTotalScore()) {
                rank = schoolMap.size() - queue.size();
            }
            prevTotalScore = school.getTotalScore();
            System.out.println(rank + " " + school.getName() + " " + school.getTotalScore() + " " + school.getNumOfStudents());
        }
    }
}

class School {
    private String name;
    private int B;
    private int A;
    private int T;
    private int totalScore;
    private int numOfStudents;

    public School() {
        this.B = 0;
        this.A = 0;
        this.T = 0;
        this.totalScore = 0;
        this.numOfStudents = 0;
    }

    public void addB(int score) {
        B += score;
    }

    public void addA(int score) {
        A += score;
    }

    public void addT(int score) {
        T += score;
    }

    public void Cal() {
        totalScore = (int) (B / 1.5 + A + T * 1.5);
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void incrementNumOfStudents() {
        numOfStudents++;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public String getName() {
        return name;
    }
}
