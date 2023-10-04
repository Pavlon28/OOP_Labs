//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Laborator_1.Operation;

import Laborator_1.Classes.Faculty;
import Laborator_1.Classes.StudyField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class GeneralOperations {
    private static final List<Faculty> faculties = Faculty.getFacultyList();

    public GeneralOperations(Scanner scanner) {
        String input = null;

        while(true) {
            while(true) {
                while(true) {
                    label64:
                    while(!Objects.equals(input, "b")) {
                        Interface.printGeneralOperations();
                        input = scanner.nextLine();
                        ArrayList<String> clearInput = Cleaner.removeAllSlashes(input);
                        String field;
                        switch ((String)clearInput.get(0)) {
                            case "nf":
                                if (clearInput.size() == 4) {
                                    FileManager.writeData(input);
                                    field = (String)clearInput.get(1);
                                    String facultyAbbreviation = (String)clearInput.get(2);
                                    StudyField studyField = StudyField.valueOf((String)clearInput.get(3));
                                    Faculty faculty = new Faculty(field, facultyAbbreviation, studyField);
                                    Faculty.addFaculty(faculty);
                                    System.out.println("\nFaculty created.");
                                } else {
                                    System.out.println("\nInvalid input");
                                }
                                break;
                            case "df":
                                System.out.println("\nAvailable faculties:");
                                Iterator var10 = faculties.iterator();

                                while(true) {
                                    if (!var10.hasNext()) {
                                        continue label64;
                                    }

                                    Faculty faculty = (Faculty)var10.next();
                                    System.out.println(" - " + faculty.getName());
                                }
                            case "dl":
                                if (clearInput.size() == 2) {
                                    field = (String)clearInput.get(1);
                                    if (StudyField.validation(field)) {
                                        System.out.println("\nFaculties from the " + field + " field:");
                                        Iterator var7 = faculties.iterator();

                                        while(var7.hasNext()) {
                                            Faculty faculty = (Faculty)var7.next();
                                            if (faculty.getStudyField().toString().equals(field)) {
                                                System.out.println(" - " + faculty.getName());
                                            }
                                        }
                                    } else {
                                        System.out.println("\nInvalid field");
                                    }
                                } else {
                                    System.out.println("\nInvalid input");
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
    }
}
