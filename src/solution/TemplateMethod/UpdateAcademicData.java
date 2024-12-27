package solution.TemplateMethod;

import solution.models.AcademicData;
import solution.models.Student;
import solution.singleton.StudentRepository;

public class UpdateAcademicData extends UpdateTemplate {
    @Override
    protected Student findStudent() {
        System.out.print("NIM of student to be updated: ");
        String nim = sc.nextLine();
        for (Student student : StudentRepository.getInstance().getStudents()) {
            if (student.getAcademicData() != null && student.getAcademicData().getNIM().equals(nim)) {
                return student;
            }
        }
        return null;
    }

    @Override
    protected void displayCurrentData(Student student) {
        AcademicData data = student.getAcademicData();
        System.out.println("Current Academic Data:");
        student.academicView();
    }

    @Override
    protected void performUpdate(Student student) {
    	AcademicData data = student.getAcademicData();
    	System.out.println("What do you want to update ? [Major | Kelas]:");
		switch(sc.nextLine().toLowerCase()) {
		case "major" :
			System.out.println("New Major : ");
			data.setMajor(sc.nextLine());break;
		case "kelas" :
			System.out.println("New Kelas : ");
			data.setKelas(sc.nextLine());break;
		}
    }

	@Override
	protected void show() {
		for (Student student : StudentRepository.getInstance().getStudents()) {
			if(student.getAcademicData() != null)
				student.academicView();
		}
	}
    
}
