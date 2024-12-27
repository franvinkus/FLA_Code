package solution.strategies;

import java.util.Scanner;

import solution.models.Student;
import solution.singleton.StudentRepository;

public class DeleteStudentStrategy implements StudentOperationStrategy {
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void execute() {
		StudentRepository studentRepository = StudentRepository.getInstance();
		studentRepository.show();
		System.out.println("Name of student to be removed: ");
		String name = sc.nextLine();
		for(Student student:studentRepository.getStudents()) {
			if(student.getPersonalData().getName().equals(name)) {
				System.out.println("Are you sure ? [Enter yes to proceed] : ");
				if(sc.nextLine().equalsIgnoreCase("yes")) {
					studentRepository.removeStudent(student);
					System.out.println("Student Data has been deleted");
					return;
				}else {
					System.out.println("Name not found");
					return;
				}
			}
		}
	}
}
