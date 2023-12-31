package Laborator_1.Classes;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final Integer month;
    private final Integer day;
    private final Integer year;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String facultyAbbreviation;
    private boolean isGraduated;
    private static final List<Student> studentsList = new ArrayList<>();

    public Student(String firstName, String lastName, String email, Integer day, Integer month, Integer year, String facultyAbbreviation){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.day = day;
        this.month = month;
        this.year = year;
        this.facultyAbbreviation = facultyAbbreviation;
        this.isGraduated = false;
    }

    public static void addStudent(Student student) {
        studentsList.add(student);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Integer getDay() {
        return day;
    }

    public Integer getMonth() {
        return month;
    }

    public Integer getYear() {
        return year;
    }

    public static List<Student> getStudentsList() {
        return studentsList;
    }
    public String getFacultyAbbreviation() {
        return facultyAbbreviation;
    }

    public void linkWithFaculty(Faculty faculty) {
        faculty.addStudent(this);
    }

    public boolean isGraduated() {
        return isGraduated;
    }

    public void graduate() {
        this.isGraduated = true;
    }
}