package solution.singleton;

import java.util.ArrayList;

import solution.models.Student;

public class StudentRepository {
	private static StudentRepository instance;
	private final ArrayList<Student> students;

	private StudentRepository() {
		students = new ArrayList<>();
	}

	public static StudentRepository getInstance() {
		if (instance == null) {
			instance = new StudentRepository();
		}
		return instance;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public int getLastNIM() {
		return Integer.parseInt(students.get(students.size()-1).getAcademicData().getNIM());
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void removeStudent(Student student) {
		students.remove(student);
	}
	
	public void show() {
		for (Student student : students) {
			if(students.equals(null)) {
				System.out.println("There is no Data");
				return;
			}
			System.out.println("===========================");
			student.studentView();
			if(student.getAcademicData() != null) {
				student.academicView();
				System.out.println(" ");
			}
			
		}
		
	}

}
