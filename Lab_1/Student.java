package Lab_1;

import java.util.Date;

public class Student {
    private final String FirstName;
    private final String LastName;
    private final String Email;
    private final Date EnrollmentDate;
    private final Date DateOfBirth;
    public Student(String FirstName, String LastName, String Email, Date EnrollmentDate, Date DateOfBirth){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.EnrollmentDate = EnrollmentDate;
        this.DateOfBirth = DateOfBirth;
    }

}
