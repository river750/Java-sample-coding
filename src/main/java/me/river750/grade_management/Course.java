package main.java.me.river750.grade_management;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String teacher;
    private List<Student> students;

    public Course(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public double getAverageGrade() {
        if (students.isEmpty()) {
            return 0.0;
        }
        int total = 0;
        int studentCount = 0;
        for (Student student : students) {
            total += student.getGrade(name);
            studentCount++;
        }
        return (double) total / studentCount;
    }
}
