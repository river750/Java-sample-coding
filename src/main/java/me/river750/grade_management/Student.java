package main.java.me.river750.grade_management;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int id;
    private Map<String, Integer> grades;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.grades = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void addGrade(String courseName, int grade) {
        grades.put(courseName, grade);
    }

    public int getGrade(String courseName) {
        return grades.getOrDefault(courseName, 0);
    }

    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades.values()) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    @Override
    public String toString() {
        return "氏名: " + this.name + ", ID: " + this.id;
    }
}