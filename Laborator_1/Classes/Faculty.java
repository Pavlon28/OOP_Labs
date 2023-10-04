//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Laborator_1.Classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Faculty {
    private final String name;
    private final String abbreviation;
    private List<Student> students;
    private final StudyField studyField;
    private static final List<Faculty> facultyList = new ArrayList();

    public Faculty(String name, String abbreviation, StudyField studyField) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.studyField = studyField;
        this.students = new ArrayList();
    }

    public static void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public String getName() {
        return this.name;
    }

    public String getAbbreviation() {
        return this.abbreviation;
    }

    public StudyField getStudyField() {
        return this.studyField;
    }

    public static List<Faculty> getFacultyList() {
        return facultyList;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public static Faculty findFacultyByAbbreviation(List<Faculty> faculties, String abbreviation) {
        Iterator var2 = faculties.iterator();

        Faculty faculty;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            faculty = (Faculty)var2.next();
        } while(!faculty.getAbbreviation().equals(abbreviation));

        return faculty;
    }
}
