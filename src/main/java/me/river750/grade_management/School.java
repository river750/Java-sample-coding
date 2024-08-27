package main.java.me.river750.grade_management;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;
    private List<Course> courses;

    public School() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public double getCourseAverage(String courseName) {
        for (Course course : courses) {
            if (course.getName().equals(courseName)) {
                return course.getAverageGrade();
            }
        }
        return 0.0;
    }

    public double getStudentAverage(String studentName) {
        for (Student student : students) {
            if (student.getName().equals(studentName)) {
                return student.calculateAverage();
            }
        }
        return 0.0;
    }
}
