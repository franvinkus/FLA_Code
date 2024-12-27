package solution.strategies;

import java.util.ArrayList;
import java.util.Scanner;

import problem.AcademicData;
import problem.PersonalData;
import solution.Admin;
import solution.builder.StudentBuilder;
import solution.factory.DataFactory;
import solution.models.Student;
import solution.singleton.StudentRepository;

public class InsertStudentStrategy implements StudentOperationStrategy{
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void execute() {
		System.out.println("1. Student Personal Data");
		System.out.println("2. Student Academic Data");
		switch(sc.nextLine()) {
		case "1":
			insertPersonal();sc.nextLine();
			break;
		case "2":
			insertAcademic();sc.nextLine();
			break;
		}
	}
	
	private void insertPersonal() {
		System.out.print("Student Name: ");
		String name = sc.nextLine();
		System.out.print("Student DOB: ");
		String DOB = sc.nextLine();
		System.out.print("Student Address: ");
		String address = sc.nextLine();
		System.out.print("Student Phone Number: ");
		String phoneNumber;
		do {
			phoneNumber = sc.nextLine();
		}while(phoneNumber.length() != 12);
		//---------
		String[] names = name.split(" ");
		String email = String.format(names[0],".",names[names.length-1],"@binus.ac.id");
		//---------
		
		StudentRepository studentRepository = StudentRepository.getInstance();
		studentRepository.addStudent(new StudentBuilder().setName(name).setDOB(DOB).
				setAddress(address).setPhoneNumber(phoneNumber).setEmail(email).build());
		System.out.println("Personal Data added successfully");
		
	}
	
	private void insertAcademic(){
		int index = getStudent(); sc.nextLine();
		if(index == -1) {
			return;
		}
		String nIM = Integer.toString(Admin.nimCounter++);
		//---------
		System.out.println("Degree: ");
		String degree = sc.nextLine();
		System.out.println("Major :");
		String major = sc.nextLine();
		System.out.println("Class : ");
		String kelas = sc.nextLine();
		//---------
		StudentRepository.getInstance().getStudents().get(index).setAcademicData(DataFactory.createAcademicData(nIM, degree, major, kelas));
		System.out.println("Academic Data added successfully");
		
	}
	
	private int getStudent() {
		int count = 1;
		if(StudentRepository.getInstance().getStudents().isEmpty()) {
			System.out.println("No student data yet");
			return -1;
		}
		for (Student student : StudentRepository.getInstance().getStudents()) {
			System.out.printf("%d. %s\n", count++ , student.getPersonalData().getName());
		}
		System.out.println("Input Student Number: " );
		return sc.nextInt() - 1;
	}

}
