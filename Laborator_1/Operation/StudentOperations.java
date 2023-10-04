//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Laborator_1.Operation;

import Laborator_1.Classes.Student;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class StudentOperations {
    private static final List<Student> students = Student.getStudentsList();

    public StudentOperations(Scanner scanner) {
        String input = null;

        while(true) {
            label66:
            while(!Objects.equals(input, "b")) {
                Interface.printStudentOperations();
                input = scanner.nextLine();
                ArrayList<String> clearInput = Cleaner.removeAllSlashes(input);
                PrintStream var10000;
                String var10001;
                Iterator var6;
                Student student;
                switch ((String)clearInput.get(0)) {
                    case "fd":
                        System.out.println("\nAll-time Students data:");
                        var6 = students.iterator();

                        while(true) {
                            if (!var6.hasNext()) {
                                continue label66;
                            }

                            student = (Student)var6.next();
                            var10000 = System.out;
                            var10001 = student.getFirstName();
                            var10000.println(" - " + var10001 + " " + student.getLastName() + " | Date of Birth: " + student.getDay() + "." + student.getMonth() + "." + student.getYear() + " | Email: " + student.getEmail() + " | Faculty: " + student.getFacultyAbbreviation());
                        }
                    case "fe":
                        System.out.println("\nEnrolled students data:");
                        var6 = students.iterator();

                        while(true) {
                            if (!var6.hasNext()) {
                                continue label66;
                            }

                            student = (Student)var6.next();
                            if (!student.isGraduated()) {
                                var10000 = System.out;
                                var10001 = student.getFirstName();
                                var10000.println(" - " + var10001 + " " + student.getLastName() + " | Date of Birth: " + student.getDay() + "." + student.getMonth() + "." + student.getYear() + " | Email: " + student.getEmail() + " | Current faculty: " + student.getFacultyAbbreviation());
                            }
                        }
                    case "fg":
                        System.out.println("\nGraduate students data:");
                        var6 = students.iterator();

                        while(var6.hasNext()) {
                            student = (Student)var6.next();
                            if (student.isGraduated()) {
                                var10000 = System.out;
                                var10001 = student.getFirstName();
                                var10000.println(" - " + var10001 + " " + student.getLastName() + " | Date of Birth: " + student.getDay() + "." + student.getMonth() + "." + student.getYear() + " | Email: " + student.getEmail() + " | Graduated faculty: " + student.getFacultyAbbreviation());
                            }
                        }
                    case "b":
                        break;
                    case "q":
                        System.exit(0);
                    default:
                        System.out.println("\t\nInvalid input");
                }
            }

            return;
        }
    }
}
