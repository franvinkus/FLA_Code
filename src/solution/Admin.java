package solution;
import java.util.ArrayList;
import java.util.Scanner;

import solution.models.AcademicData;
import solution.models.PersonalData;
import solution.models.Student;
import solution.singleton.StudentRepository;
import solution.strategies.DeleteStudentStrategy;
import solution.strategies.InsertStudentStrategy;
import solution.strategies.UpdateStudentStrategy;

public class Admin {
	Scanner sc = new Scanner(System.in); // public scanner
	public static int nimCounter = 1;
	private StudentRepository studentRepository = StudentRepository.getInstance();
	
	public Admin() {
		while(true){
			System.out.println("Welcome to admin page\n======");
			System.out.println("1. Insert Student Data");
			System.out.println("2. Update Student Data");
			System.out.println("3. Delete Student Data");
			System.out.println("4. Show Student Data");
			System.out.println("5. Exit");
			switch(sc.nextLine()) {
			case "1":
				new InsertStudentStrategy().execute(); sc.nextLine();
			break;
			
			case "2":
				new UpdateStudentStrategy().execute(); sc.nextLine();
			break;
			
			case "3":
				new DeleteStudentStrategy().execute();sc.nextLine();
			break;
			
			case "4":
				studentRepository.show();
			break;
			
			case "5":
				return;
			}
		}
		
	}
}