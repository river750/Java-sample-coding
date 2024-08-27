// 学校の成績管理システム

package main.java.me.river750.grade_management;

public class Main {
    public static void main(String[] args) {
        // 学生を作成
        Student s1 = new Student("田中太郎", 1);
        Student s2 = new Student("山田花子", 2);

        // 科目に成績を追加
        s1.addGrade("数学", 90);
        s1.addGrade("英語", 85);
        s2.addGrade("数学", 80);
        s2.addGrade("英語", 70);

        // 科目を作成
        Course math = new Course("数学", "鈴木先生");
        Course english = new Course("英語", "佐々木先生");

        // 科目に学生を追加
        math.addStudent(s1);
        math.addStudent(s2);
        english.addStudent(s1);
        english.addStudent(s2);

        // 学校を作成
        School school = new School();
        school.addStudent(s1);
        school.addStudent(s2);
        school.addCourse(math);
        school.addCourse(english);

        // 平均成績の取得
        System.out.println(math.getName() + "の平均点: " + school.getCourseAverage(math.getName()));
        System.out.println(s1.getName() + "の平均点: " + school.getStudentAverage(s1.getName()));
    }
}
