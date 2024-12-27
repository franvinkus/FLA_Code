package solution.factory;

import solution.models.AcademicData;
import solution.models.PersonalData;

public class DataFactory {
    public static PersonalData createPersonalData(String name, String DOB, String address, String email, String phoneNumber) {
        return new PersonalData(name, DOB, address, email, phoneNumber);
    }

    public static AcademicData createAcademicData(String nIM, String degree, String major, String kelas) {
        return new AcademicData(nIM, degree, major, kelas);
    }
}

