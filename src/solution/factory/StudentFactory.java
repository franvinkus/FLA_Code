package solution.factory;

import solution.builder.StudentBuilder;
import solution.models.AcademicData;
import solution.models.PersonalData;
import solution.models.Student;

public class StudentFactory {
    public static Student createStudent(PersonalData personalData) {
        return new Student(personalData);
    }
}
