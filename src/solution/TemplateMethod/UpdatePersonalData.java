package solution.TemplateMethod;

import solution.models.Student;
import solution.singleton.StudentRepository;

public class UpdatePersonalData extends UpdateTemplate{
	@Override
	protected Student findStudent() {
		System.out.print("Name of student to be updated: ");
        String name = sc.nextLine();
        for (Student student : StudentRepository.getInstance().getStudents()) {
            if (student.getPersonalData().getName().equals(name)) {
                return student;
            }
        }
        return null;
	}

	@Override
	protected void displayCurrentData(Student student) {
		System.out.println("Current Student data");
		student.studentView();
	}

	@Override
	protected void performUpdate(Student student) {
		System.out.println("What do you want to update ? [Address | Phone Number] :");
		switch(sc.nextLine().toLowerCase()) {
		case "address" :
			System.out.println("New Address : ");
			student.getPersonalData().setAddress(sc.nextLine());
			break;
		case "phone number" :
			System.out.println("New Phone Number : ");
			student.getPersonalData().setPhoneNumber(sc.nextLine());				
			break;
		}
	}

	@Override
	protected void show() {
		if(StudentRepository.getInstance().getStudents().isEmpty()) {
			System.out.println("There is no Data");
			return;
		}
		for (Student student : StudentRepository.getInstance().getStudents()) {
			System.out.println("===========================");
			student.studentView();
			if(student.getAcademicData() != null) {
				student.academicView();
				System.out.println(" ");
			}
			
		}
	}
}
